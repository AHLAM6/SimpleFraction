public class Fraction {
	private int num ;
	private int den;
public Fraction( int num, int den ) {
	this.num= num;
	this.den=den;
	
}
public String toString()
{
	if (this.den==0) {
	return"erreur division entière par 0";
	}
	else 
	{
	System.out.println("La fraction est:"+this.num+"/"+this.den);
	return"la fraction est :"+ this.num+"/"+this.den;
	}

	
}

}
