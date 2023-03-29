package com.example.dependencyInjection;

public class CricketCoach implements Coach {

        private String emailAddress;
        private String team;

        public String getEmailAddress() {
            return emailAddress;
        }

        public void setEmailAddress(String emailAddress) {
            System.out.println("CricketCoach: inside setter method - setEmailAddress");
            this.emailAddress = emailAddress;
        }

        public String getTeam() {
            return team;
        }

        public void setTeam(String team) {
            System.out.println("CricketCoach: inside setter method - setTeam");
            this.team = team;
        }


        private FortuneService fortuneService;

        public CricketCoach() {

        }

        public CricketCoach(FortuneService fortuneService) {
            this.fortuneService = fortuneService;
        }

        @Override
        public String getDailyWorkout() {
            return "Practice fast bowling for 15 minutes";
        }

        @Override
        public String getDailyFortune() {
            return "Just Do It: " + fortuneService.getFortune();
        }

    public void setFortuneService(HappyFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
