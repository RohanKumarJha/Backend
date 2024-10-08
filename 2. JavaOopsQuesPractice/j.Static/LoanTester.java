public class LoanTester{
    public static void main (String[] args){
    
       //Create 2 objects of Loan class using the default and 2 using parametrized constructor.
       //Use getter methods and display the value of loanCounter for every instance
       
       Loan objDef1 = new Loan();
       System.out.println(objDef1.getLoanCounter());
       Loan objDef2 = new Loan();
       System.out.println(objDef2.getLoanCounter());

       Loan objPara1 = new Loan();
       System.out.println(objPara1.getLoanCounter());
       Loan objPara2 = new Loan();
       System.out.println(objPara2.getLoanCounter());
       
   }
 }
 