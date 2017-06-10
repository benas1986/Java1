package ketvirtaPaskaita;

import java.util.EnumSet;

/**
 * Created by Lina on 2017.06.10.
 */
public class Savaite {
    public enum Week {
        MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4),
        FRIDAY(5), SATURDAY(6), SUNDAY(7);

        private int day;

        Week(int day) {
            this.day = day;
        }

        public int getDay() {
            return day;
        }

        public static EnumSet<Week> getWeeks(){
            return EnumSet.allOf(Week.class);
        }

        public static Week getWeekDay(int number){
            Week week = MONDAY;
            for (Week w : getWeeks()){
                if (w.getDay() == number){
                    week = w;
                }
            }
            return week;
        }

    }
}
