package com.om.enumsExample;

public class Basic {
    enum Week implements A {
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        // these are enum constants
        //public, static and final
        //since its final u can't create child enum
        //type is weeK
        
        Week() {
            System.out.println("Constructor called for " + this); //this is overridden and it prints name of the constants
        }

        @Override
        public void hello() {
            System.out.println("hello");
        }
        //this is not public or protected, only private or default
        //why?  we don't want to create new object
        // this is not the enum concept, that why

        //internally:
        // public static final week Monday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();

        System.out.println(week);

        for(Week day: Week.values()) {
            System.out.println(day);
        }
    }
}
