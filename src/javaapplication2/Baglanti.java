package javaapplication2;

//import java.sql.ResultSet;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.sql.SQLException;

public class Baglanti {
    
    public static Connection c ; 
    
        
	
	public static void main (String [] args){
           
                    
        baglanti();
        //int secim=0;
        
         //Scanner scan=new Scanner(System.in); 
        
        /*while(secim!=8){
            
            System.out.println("Lütfen yapmak istediginiz işlemi seçin");
            System.out.println();
            System.out.println("1-Bölüm Tablosunu Listele\n2-Personel Tablosunu Listele\n3-Kodla Personel Ekle\n4-Kodla Bölüm Ekle\n5-Elle Personel Ekleme\n");  
            
            secim=scan.nextInt();
            switch(secim){
                case 1:
                    BolumListe();
                    break;
                case 2:
                    PersonelListe();
                    break;
                case 3:
                    KodlaPersonelEkle();
                    break;
                case 4:
                    KodlaBolumEkle();
                    break;
                case 5:
                    ElleBolumEkle();
                    break;
                case 8:
                    break;
        }
        }*/
        
            
	//baglanti();
	//ekle();
	bagKapat();
        }
        
       /* public static void BolumListe(){
        
        try {   
            PreparedStatement stat=c.prepareStatement("select * from bolum");
            ResultSet Rs=stat.executeQuery();
            while(Rs.next()){
                System.out.println(Rs.getInt(1)+" "+Rs.getString(2)+" "+Rs.getInt(3));}
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
            System.out.println();
        
        }*/
        
        /*public static void PersonelListe(){
        
        try {   
            PreparedStatement stat=c.prepareStatement("select * from personel");
            ResultSet Rs=stat.executeQuery();
            while(Rs.next()){
                System.out.println(Rs.getInt(1)+"   "+Rs.getString(2)+"   "+Rs.getString(3)+"   "+Rs.getString(4)+"   "+Rs.getLong(5)+"   "+Rs.getString(6)+"   "+Rs.getInt(7));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        }*/
        
       
        
        /*public static void KodlaPersonelEkle() {
		
		String sql = "INSERT INTO personel values (7,412342,'Alaa','Shati',6253215,'Doc.',1)";
		
		try {
			Statement sta = c.createStatement();
			sta.execute(sql);
			System.out.println("Ekleme Başarılı");
		}catch (Exception e){
			
			e.printStackTrace();
			System.out.println(e.toString());
		    }
		}*/
        
       /* public static void KodlaBolumEkle() {
		
		String sql = "INSERT INTO bolum values (7,'Biyomedikal',1)";
		
		try {
			Statement sta = c.createStatement();
			sta.execute(sql);
			System.out.println("Ekleme Başarılı");
		}catch (Exception e){
			
			e.printStackTrace();
			System.out.println(e.toString());
		    }
		}*/
        
        /*public static void ElleBolumEkle() {
            
                Scanner scan=new Scanner(System.in);
                System.out.println("Bölüm id'sini giriniz...");       
		int bolum_id=scan.nextInt();
                System.out.println("Bölüm isimini giriniz...");  
                String bolum_isim=scan.next();
                System.out.println("Uni id'sini giriniz...");  
                int uni_id=scan.nextInt();
                
		String sql = "INSERT INTO bolum values ('"+bolum_id+"','"+bolum_isim+"','"+uni_id+"')";
		
		try {
			Statement sta = c.createStatement();
			sta.execute(sql);
			System.out.println("Ekleme Başarılı");
		}catch (Exception e){
			
			e.printStackTrace();
			System.out.println(e.toString());
		    }
		}*/
        
        public static void baglanti(){
		
		try {
			Class.forName("org.postgresql.Driver");
			String baglanti = "jdbc:postgresql://localhost:5432/AkademikPersonel";
			String KulAdi = "postgres";
			String KulSifre = "123" ;
			c = DriverManager.getConnection(baglanti, KulAdi, KulSifre);
			System.out.println("Baglantı Başarılı");
		}catch (Exception e){
			System.out.println(e.toString());
		}
	   }
        
        public static void bagKapat() {
			try {
			c.close();
			System.out.println("Baglantı Başarı ile Kapatıldı");
			}catch (Exception e){
			System.out.println(e.toString());
			}
			
		}
}
