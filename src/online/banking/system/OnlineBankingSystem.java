/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package online.banking.system;

/**
 *
 * @author hp
 */
public class OnlineBankingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Loading ll = new Loading();
        ll.setVisible(true);
        try{
                for(int i=0;i<=100;i++)
                {
                    Thread.sleep(40);
                    ll.lb1.setText(Integer.toString(i)+"%");
                    Welcome ww = new Welcome();
                    if(i==100)
                    {
                        ll.dispose();
                        ww.show();
                    }
                }
        }
        catch(InterruptedException e)
        {
            
        }}
    
}
