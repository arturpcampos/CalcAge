import java.time.LocalDate;
import java.time.Period;

public class CalcAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate hoje = LocalDate.now(); 
		LocalDate dtNasc = LocalDate.of(1917, 3, 8);
		int idade = Period.between(dtNasc, hoje).getYears();
		
		System.out.println(hoje);
		System.out.println(dtNasc);
		System.out.println(idade);
	}

}
