package Projet;

import myconnections.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;



public class GestBureau {


    private Scanner sc = new Scanner(System.in);
    private Connection dbConnect;

    public void gestion() {
        dbConnect = DBConnection.getConnection();
        if (dbConnect == null) {
            System.exit(1);
        }
        System.out.println("connexion établie");
        do {
            System.out.println("1.ajout\n2.recherche\n3.modification\n4.suppression\n5.fin");
            System.out.println("choix : ");
            int ch = sc.nextInt();
            sc.skip("\n");
            switch (ch) {
                case 1:
                    ajout();
                    break;
                case 2:
                    recherche();
                    break;
                case 3:
                    modification();
                    break;
                case 4:
                    suppression();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("choix invalide recommencez ");
            }
        } while (true);

    }

    public void ajout() {

        System.out.print("sigle :");
        String sigle = sc.nextLine();
        System.out.print("téléphone :");
        String tel = sc.nextLine();
        String query1 = "insert into BUREAU(sigle,numero_telephone) values(?,?)";
        String query2 = "select idbureau from BUREAU where sigle= ? and numero_telephone =?";
        try(PreparedStatement pstm1= dbConnect.prepareStatement(query1);
            PreparedStatement pstm2= dbConnect.prepareStatement(query2);
        ){
            pstm1.setString(1,sigle);
            pstm1.setString(2,tel);
            int n = pstm1.executeUpdate();
            System.out.println(n+" ligne insérée");
            if(n==1){
                pstm2.setString(1,sigle);
                pstm2.setString(2,tel);
                ResultSet rs= pstm2.executeQuery();
                if(rs.next()){
                    int idbureau= rs.getInt(1);
                    System.out.println("idclient = "+idbureau);
                }
                else System.out.println("record introuvable");
                rs.close();
            }

        } catch (SQLException e) {
            System.out.println("erreur sql :"+e);
        }
    }


    public void recherche() {

        System.out.println("id du bureau recherché ");
        int idrech = sc.nextInt();
        String query = "select * from BUREAU where idbureau = ?";
        try(PreparedStatement pstm = dbConnect.prepareStatement(query)) {
            pstm.setInt(1,idrech);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                String sigle = rs.getString(2);
                String tel = rs.getString(3);
                System.out.printf("%d %s %s\n",idrech,sigle,tel);
            }
            else System.out.println("record introuvable");
            rs.close();
        } catch (SQLException e) {
            System.out.println("erreur sql :"+e);
        }
    }

    public void modification() {
        System.out.println("id du bureau recherché ");
        int idrech = sc.nextInt();
        sc.skip("\n");
        System.out.println("nouveau téléphone ");
        String ntel = sc.nextLine();
        String query = "update BUREAU set numero_telephone=? where idbureau = ?";
        try(PreparedStatement pstm = dbConnect.prepareStatement(query)) {
            pstm.setString(1,ntel);
            pstm.setInt(2,idrech);
            int n = pstm.executeUpdate();
            if(n!=0) System.out.println(n+ "ligne mise à jour");
            else System.out.println("record introuvable");

        } catch (SQLException e) {
            System.out.println("erreur sql :" + e);
        }
    }
    public void suppression() {
        System.out.println("id du client recherché ");
        int idrech = sc.nextInt();
        String query = "delete from BUREAU where idbureau = ?";
        try(PreparedStatement pstm = dbConnect.prepareStatement(query)) {
            pstm.setInt(1,idrech);
            int n = pstm.executeUpdate();
            if(n!=0) System.out.println(n+ "bureau supprimé");
            else System.out.println("record introuvable");

        } catch (SQLException e) {
            System.out.println("erreur sql :"+e);
        }

    }



    public static void main(String[] args) {

        ResourceBundle labels = ResourceBundle.getBundle("resources.application");
        GestBureau g = new GestBureau();
        g.gestion();
    }






}
