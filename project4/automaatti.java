    
    import java.util.Scanner;  
      
    
    public class automaatti  
    {  
        //starttaa metodi 
        public static void main(String args[] )  
        {  
              
            int balance = 100000, withdraw, deposit;  
              
            try (//Luodaan scanner-luokka  
            Scanner sc = new Scanner(System.in)) {
                while(true)  
                {  
                    System.out.println("Automated Teller Machine");  
                    System.out.println("Valitse 1 nostaaksesi käteistä");  
                    System.out.println("Valitse 2 talletukselle");  
                    System.out.println("Valitse 3 tarkistaaksesi tilin saldon");  
                    System.out.println("valitse 4 poistuaksesi");  
                    System.out.print("Valitse toiminto, jonka haluat suorittaa:");  
                      
                    //käyttäjän valinta  
                    int choice = sc.nextInt();  
                    switch(choice)  
                    {  
                        case 1:  
                System.out.print("Syötä nostettava summa: ");  
                              
                //Nosto 
                withdraw = sc.nextInt();  
                              
                //Tarkistetaan, onko saldo suurempi tai yhtä suuri kuin nostosumma
                if(balance >= withdraw)  
                {  
                    
                    balance = balance - withdraw;  
                    System.out.println("Nosta rahat, ole hyvä");  
                }  
                else  
                {  
                    //näytetään error  
                    System.out.println("Saldo ei riitä!");  
                }  
                System.out.println("");  
                break;  
      
                        case 2:  
                              
                System.out.print("Syötä rahat talletaaksesi:");  
                              
                //annetaan talletus 
                deposit = sc.nextInt();  
                              
                // talletus 
                balance = balance + deposit;  
                System.out.println("Talletus onnistui!");  
                System.out.println("");  
                break;  
      
                        case 3:  
                //näytetään käyttäjän saldo  
                System.out.println("Tilin saldo : "+balance);  
                System.out.println("");  
                break;  
      
                        case 4:  
                //poistutaan valikosta  
                System.exit(0);  
                    }  
                }
            }  
        }  
    }  