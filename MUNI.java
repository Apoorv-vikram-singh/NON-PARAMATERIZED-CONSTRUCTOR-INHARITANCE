class kapil
{
	kapil()
	{
		System.out.println("KAPIL..NON PARA CONSTRUCTER..BASE");
	}
}
class MUNI extends kapil
{
	MUNI()
	{	
		System.out.println("GLA..NONPARACONS..DERIVED");
	}
	public static void main(String args[])
	{
		MUNI onj=new MUNI();
	}
}