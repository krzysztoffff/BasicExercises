package methods;

/**
 * 
 * 
 * Tre�� zadania 
 * Gdy klub pi�karski A gra dwumecz z klubem pi�karskim B, oznacza to, �e graj� jeden mecz na boisku dru�yny A i jeden na boisku dru�yny B.
Wygrywa ta dru�yna, kt�ra zdob�dzie wi�cej goli w obu meczach.
W przypadku, gdy dru�yny zdoby�y tyle samo bramek, gole zdobyte na wyje�dzie licz� si� jako "troch� wa�niejsze" i wygrywa ta dru�yna, kt�ra zdoby�a wi�cej bramek na wyje�dzie.
Remis w dwumeczu wypada wtedy, gdy obie dru�yny maj� tyle samo bramek na wyje�dzie.
Na przyk�ad:
W Pucharze Polski graj� dwa zespo�y: Grom i B�yskawica. Zespo�y rozegra�y nast�puj�ce mecze:
Gospodarz: Grom.
Grom 0:2 B�yskawica
Gospodarz: B�yskawica.
B�yskawica 1:3 Grom
Sumaryczny wynik dwumeczu wynosi 3:3. Jednak Grom na wyje�dzie zdoby� 3 bramki, a B�yskawica tylko 2. Zatem wygrywa Grom.
 * 
 * Napisz metod�, footballWin, kt�ra przyjmie nast�puj�ce parametry:

    Gole zdobyte przez zesp� A w pierwszym meczu (na boisku zepo�u A),
    Gole zdobyte przez zesp� B w pierwszym meczu (na boisku zepo�u A),
    Gole zdobyte przez zesp� A w drugim meczu (na boisku zespo�u B),
    Gole zdobyte przez zesp� B w drugim meczu (na boisku zespo�u B),

	po czym zwr�ci 1, je�li dwumecz wygra� zesp� A, 2 � je�li B. 
	W przypadku remisu, zwr�� X. Wynik ma by� �a�cuchem tekstowym, nie liczb�!
 *
 */
public class Main10 {

    public static void main(String[] args) {
     
    	int homeGoalTeamFirst = 1, homeGoalTeamSecond = 2, abroadGoalTeamFirst = 2, abroadGoalTeamSecond = 1; //points declaration
    	
    	String result = footballWin(homeGoalTeamFirst, homeGoalTeamSecond, abroadGoalTeamFirst, abroadGoalTeamSecond);
    	System.out.println(result);
    }
    
    
    
    static String footballWin(int homeGoalTeamFirst, int homeGoalTeamSecond,
    		int abroadGoalTeamFirst, int abroadGoalTeamSecond) {
    	float multiplyPoints = 1.1f;   
    	float resultTeamFirst = homeGoalTeamFirst + (abroadGoalTeamFirst * multiplyPoints);
    	float resultTeamSecond = homeGoalTeamSecond + (abroadGoalTeamSecond * multiplyPoints);
    	
    	return "The winner is team no. " + printResult(resultTeamFirst, resultTeamSecond) + " (X mens draw)."; 	//one static method can run another static metchod
    }
    
    static String printResult(float resultTeamFirst, float resultTeamSecond) {
    	if (resultTeamFirst > resultTeamSecond)
    		return "1";
    	else if (resultTeamFirst < resultTeamSecond)
    		return "2";
    	else
    		return "X";
    }
}
