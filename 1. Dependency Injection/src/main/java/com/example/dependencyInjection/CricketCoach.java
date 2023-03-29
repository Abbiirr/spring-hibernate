package com.example.dependencyInjection;

public class CricketCoach implements Coach {

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
