
public class CashReg
{ private double taxRate;
private double purchase;
private double taxablePurchase; 
private double payment;

double amount;
/** Constructs a cash register with no money in it. @param rate the tax rate for taxable purchases */ 
public CashReg(double rate, double Upurchase, double ItemPrice, double Upay) 
{
	
taxRate = rate; 
purchase = Upurchase; 
payment = Upay;
amount=ItemPrice;
}

public CashReg(){
	
	purchase=0;
	payment=0;
	amount=0;
}

public void setPurchase(double Upurchase){

	purchase=Upurchase;
}

public double getPurchase(){
	return purchase;
}

public void setItemPrice(double ItemPrice){
	
	 amount= ItemPrice;
	
}

public double getItemPrice(){
	return amount;
}

public void setPayment(double Pay){
	payment=Pay;
}

public double getPayment(){
	return payment;
}

/** Records the sale of a tax-free item. @param amount the price of the item */
public void recordPurchase() 
{ purchase = purchase + amount; } 


/** Records the sale of a taxable item. @param amount the price of the item */
public void recordTaxablePurchase()
{ taxablePurchase = taxablePurchase + amount; } 

/** Processes a payment received from the customer. @param amount the amount of the payment */
public void receivePayment()
{ payment = payment + amount; }


/** Processes the sales tax due. @return the sales tax due */
public double getSalesTax()
{ return taxablePurchase * taxRate / 100; }
/** Computes the change due and resets the machine for the next customer. @return the change due to the customer */


public double giveChange() {
	double change = getPayment() - getItemPrice() + getSalesTax();
	purchase = 0; 
	payment = 0;
	return change;
	}

} 
/** Essentially this is what is being created but just a bit bigger and broken down into 5 components with xml, and api with a database*/
