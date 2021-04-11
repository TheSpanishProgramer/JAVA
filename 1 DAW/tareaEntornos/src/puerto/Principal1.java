package puerto;

import java.util.Scanner;
public class Principal1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nom;
		int dni,fi,ff,matric,año_fabr,mastiles,potencia,camarotes;
		float pos_amarre,a,sloran;
		System.out.print("ingrese fecha  incial : ");
		fi=sc.nextInt();
		System.out.print("ingrese fecha  final : ");
		ff=sc.nextInt();
		System.out.print("ingrese esloran en metros : ");
		sloran=sc.nextFloat();
		System.out.print("ingrese nombre : ");
		nom=sc.nextLine();
		System.out.print("ingrese dni : ");
		dni=sc.nextInt();
		System.out.print("ingrese año de fabric : ");
		año_fabr=sc.nextInt();
		System.out.print("ingrese numero mastiles : ");
		mastiles=sc.nextInt();
		System.out.print("ingrese potencia : ");
		potencia=sc.nextInt();
		System.out.print("ingrese numero de camarotes : ");
		camarotes=sc.nextInt();
		System.out.print("ingrese posicion de amarre : ");
		pos_amarre=sc.nextFloat();
		System.out.print("ingrese matricula : ");
		matric=sc.nextInt();
		alquiler al=new alquiler(nom,dni,fi,ff,pos_amarre,matric,sloran,año_fabr);
		tipos_barco tp=new tipos_barco(mastiles,potencia,camarotes,matric,sloran,año_fabr);
		if (mastiles>0)
		{
			a=((al.precio_alquiler())*(tp.mostrar()));
			System.out.print("el precio del alquiler es : "+a);
		}
	}
}
