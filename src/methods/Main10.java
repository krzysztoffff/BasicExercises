package methods;

/**
 * 
 * 
 * Treœæ zadania 
 * Gdy klub pi³karski A gra dwumecz z klubem pi³karskim B, oznacza to, ¿e graj¹ jeden mecz na boisku dru¿yny A i jeden na boisku dru¿yny B.
Wygrywa ta dru¿yna, która zdobêdzie wiêcej goli w obu meczach.
W przypadku, gdy dru¿yny zdoby³y tyle samo bramek, gole zdobyte na wyjeŸdzie licz¹ siê jako "trochê wa¿niejsze" i wygrywa ta dru¿yna, która zdoby³a wiêcej bramek na wyjeŸdzie.
Remis w dwumeczu wypada wtedy, gdy obie dru¿yny maj¹ tyle samo bramek na wyjeŸdzie.
Na przyk³ad:
W Pucharze Polski graj¹ dwa zespo³y: Grom i B³yskawica. Zespo³y rozegra³y nastêpuj¹ce mecze:
Gospodarz: Grom.
Grom 0:2 B³yskawica
Gospodarz: B³yskawica.
B³yskawica 1:3 Grom
Sumaryczny wynik dwumeczu wynosi 3:3. Jednak Grom na wyjeŸdzie zdoby³ 3 bramki, a B³yskawica tylko 2. Zatem wygrywa Grom.
 * 
 * Napisz metodê, footballWin, która przyjmie nastêpuj¹ce parametry:

    Gole zdobyte przez zespó³ A w pierwszym meczu (na boisku zepo³u A),
    Gole zdobyte przez zespó³ B w pierwszym meczu (na boisku zepo³u A),
    Gole zdobyte przez zespó³ A w drugim meczu (na boisku zespo³u B),
    Gole zdobyte przez zespó³ B w drugim meczu (na boisku zespo³u B),

	po czym zwróci 1, jeœli dwumecz wygra³ zespó³ A, 2 – jeœli B. 
	W przypadku remisu, zwróæ X. Wynik ma byæ ³añcuchem tekstowym, nie liczb¹!
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
