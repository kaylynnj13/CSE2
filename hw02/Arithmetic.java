// Kaylynn Johnson
// 02/03/15
// hw 02 - Arithmetic
// the purpose of this program is to calculate the total cost of items bought at Walmart
//      plus the PA sales tax (6%)

public class Arithmetic{
    
    public static void main(String[] args){
        
        //define variables:
        int nSocks=3;                    //number of pairs of socks
        double sockCost$=2.58;           //cost per pair of socks
        int nGlasses=6;                  //number of drinking glasses
        double glassCost$=2.29;          //cost per glass
        int nEnvelopes=1;                //number of boxes of envelopes
        double envelopeCost$=3.25;       //cost per box of envelopes
        double taxPercent=0.06;          //PA sales tax
        double totalSockCost$,           //total cost of socks
               totalGlassCost$,          //total cost of drinking glasses
               totalEnvelopeCost$,       //total cost of envelopes
               sockTax,                  //total tax on all socks bought
               glassTax,                 //total tax on all glases bought
               envelopeTax,              //total tax on all envelopes bought
               totalCostBeforeTax$,    //total cost of everything bought before tax
               totalSalesTax$,           //total PA sales tax
               totalCostAfterTax$;       //total cost of purchase including sales tax
               
        //begin calculations; print the item bought, how much was bought, the cost
        //   calculate and print the cost of each item and the salex tax for each item
        
        
        System.out.println(nSocks+" socks were bought at a price of $"+sockCost$);
        System.out.println(nGlasses+" drinking glasses were bought at a price of $"+glassCost$);
        System.out.println(nEnvelopes+" envelopes were bought at a price of $"+envelopeCost$);
        
        totalSockCost$=nSocks*sockCost$*100; totalSockCost$=(int)totalSockCost$; totalSockCost$/=100.0;
        sockTax=taxPercent*totalSockCost$*100; sockTax=(int)sockTax; sockTax/=100.0;
        System.out.println("The total sock cost is $"+totalSockCost$+" with a tax of $"+sockTax);
        
        totalGlassCost$=nGlasses*glassCost$*100; totalGlassCost$=(int)totalGlassCost$; totalGlassCost$/=100.0;
        glassTax=taxPercent*totalGlassCost$*100; glassTax=(int)glassTax; glassTax/=100.0;
        System.out.println("The total glass cost is $"+totalGlassCost$+" with a tax of $"+glassTax);
        
        totalEnvelopeCost$=nEnvelopes*envelopeCost$*100; totalEnvelopeCost$=(int)totalEnvelopeCost$; totalEnvelopeCost$/=100.0;
        envelopeTax=taxPercent*totalEnvelopeCost$*100; envelopeTax=(int)envelopeTax; envelopeTax/=100.0;
        System.out.println("The total envelope cost is $"+totalEnvelopeCost$+" with a tax of $"+envelopeTax);
        
        //Compute and print the total cost (before tax), total tax, and total cost of purchase (after tax)
        totalCostBeforeTax$=totalEnvelopeCost$+totalGlassCost$+totalSockCost$;
        totalCostBeforeTax$*=100; totalCostBeforeTax$=(int)totalCostBeforeTax$; totalCostBeforeTax$/=100.0;
        totalSalesTax$=sockTax+glassTax+envelopeTax;
        totalCostAfterTax$=totalSalesTax$+totalCostBeforeTax$;
        
        System.out.println("The total cost of the purchase before tax is $"+totalCostBeforeTax$);
        System.out.println("The total cost of the the taxes is $"+totalSalesTax$);
        System.out.println("The total cost of the purchase aftertax is $"+totalCostAfterTax$);
        
    }
    
}