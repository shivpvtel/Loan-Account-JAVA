/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loanaccount;

import static loanaccount.Loanaccount.interestRate;

/**
 *
 * @author shiv0248
 */
public class Loanaccount {
//instants variables
    
    //private double for principle
    private double principle;
    public Loanaccount(double Principle) { principle = Principle;}
    //private static double for Interest
    private static double Interest;
    public static void interestRate(double Annualinterestrate) { Interest = Annualinterestrate;}
    
    // given public function
    public double calculateMonthlyPayment(int numberOfPayments) {
        double monthlyInterest = Interest/12;
        double monthlyPayment = principle * ( monthlyInterest / (1 - Math.pow(1 + monthlyInterest, -numberOfPayments)));
        return monthlyPayment;
    }

     
 // output part
    public static void main(String[] args) {

        // loan amounts
        double Amount1 = 5000.00;
        double Amount2 = 31000.00;

        //setting each respective loan to a function
        Loanaccount firstloan = new Loanaccount(Amount1);
        Loanaccount Secondloan = new Loanaccount(Amount2);

        //first line of the output
        System.out.printf("\n\nMonthly payment for loan 1 of $%.2f and loan 2 $%.2f for 3, 5, and 6 year " +
                "loans at 1%% interest.", Amount1, Amount2);

        //setting the interest rate of the first output
        interestRate(0.01);

        //this can be added to the system print to make it easier
        double L13, L15, L16, L23, L25, L26;
        //loan 1 at 1%
        L13 = firstloan.calculateMonthlyPayment(3*12);
        L15 = firstloan.calculateMonthlyPayment(5*12);
        L16 = firstloan.calculateMonthlyPayment(6*12);
        //loan 2 at 1%
        L23 = Secondloan.calculateMonthlyPayment(3*12);
        L25 = Secondloan.calculateMonthlyPayment(5*12);
        L26 = Secondloan.calculateMonthlyPayment(6*12);

        //tabular format
        System.out.printf("\nLoan    3 years  5 years  6 years");
        System.out.printf("\nLoan 1  %.2f   %.2f    %.2f", L13, L15,L16);
        System.out.printf("\nLoan 2  %.2f   %.2f   %.2f", L23,L25,L26);

        //fourth line of the output
        System.out.printf("\n\nMonthly payment for loan 1 of $%.2f and loan 2 $%.2f for 3, 5, and 6 year" +
                " loans at 5%% interest.",Amount1,Amount2);

        //setting the interest rate of the second outputs
        interestRate(0.05);
        
        //this can be added to the system print but this makes it simpler
        double l13, l15, l16, l23, l25, l26;
        //loan 1 at 5%
        l13 = firstloan.calculateMonthlyPayment(3*12);
        l15 = firstloan.calculateMonthlyPayment(5*12);
        l16 = firstloan.calculateMonthlyPayment(6*12);
        //loan 2 at 5%
        l23 = Secondloan.calculateMonthlyPayment(3*12);
        l25 = Secondloan.calculateMonthlyPayment(5*12);
        l26 = Secondloan.calculateMonthlyPayment(6*12);

        //tabular format
        System.out.printf("\nLoan    3 years  5 years  6 years");
        System.out.printf("\nLoan 1  %.2f   %.2f    %.2f", l13, l15,l16);
        System.out.printf("\nLoan 2  %.2f   %.2f   %.2f", l23,l25,l26, "\n\n");
    }


}


/*
Output 


Monthly payment for loan 1 of $5000.00 and loan 2 $31000.00 for 3, 5, and 6 year loans at 1% interest.
Loan    3 years  5 years  6 years
Loan 1  141.04   85.47    71.58
Loan 2  874.45   529.91   443.78

Monthly payment for loan 1 of $5000.00 and loan 2 $31000.00 for 3, 5, and 6 year loans at 5% interest.
Loan    3 years  5 years  6 years
Loan 1  149.85   94.36    80.52
Loan 2  929.10   585.01   499.25BUILD SUCCESSFUL (total time: 0 seconds)


*/