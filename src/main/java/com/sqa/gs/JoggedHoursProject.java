/**
 * File Name: JoggedHoursProject.java<br>
 * GS, Sheeba<br>
 * Created: Oct 7, 2017
 */
package com.sqa.gs;

import com.sqa.gs.helpers.*;

/**
 * JoggedHoursProject //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author GS, Sheeba
 * @version 1.0.0
 * @since 1.0
 */
public class JoggedHoursProject {

	private static String appName = "Jogged Hours Project";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean response = true;
		String name;
		do {
			name = AppBasics.greetUserAndGetName(appName);
			int daysJoggedInAWeek =
					AppBasics.requestInt("How many days have you jogged this week " + name + " ?", 0, 7);
			if (daysJoggedInAWeek == 0) {
				System.out.println("Hope you jog more next week buddy!");
			} else {
				double hoursJoggedInAWeek = 0;
				for (int i = 0; i < daysJoggedInAWeek; i++) {
					hoursJoggedInAWeek = hoursJoggedInAWeek + AppBasics.requestInt("Hours jogged on day " + (i + 1));
				}
				double avgHoursJoggedWeek = (hoursJoggedInAWeek / daysJoggedInAWeek);
				System.out.println("Congrats Jogger! You logged " + hoursJoggedInAWeek + " hours this week!!!");
				System.out.println("Average hours jogged " + avgHoursJoggedWeek);
				if (avgHoursJoggedWeek < 15) {
					System.out.println("Way to get started Amateur jogger " + name);
				}
				if ((avgHoursJoggedWeek > 15) && (avgHoursJoggedWeek < 40)) {
					System.out.println("GO GO Efficient Jogger " + name);
				}
				if (avgHoursJoggedWeek > 40) {
					System.out.println("WOW" + name + " is an Extremist in jogging");
				}
			}
			response = AppBasics.requestBoolean("Do you want to enter another jogger's stats?");
		} while (response == true);
		AppBasics.farewellUser(name, appName);
	}
}
