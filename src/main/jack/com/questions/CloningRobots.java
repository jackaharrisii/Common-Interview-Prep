package jack.com.questions;

/*
Given: a single robot
the robot can perform one of two actions: clone itself or plant a crop
all robots must do the same task each day and each of the two actions take an entire day

Task: plant a given number of crops in the fewest number of days

Example: Plant 10 crops
1 robot plants all the crops: 10 days, 10 crops
2 robots: 6 days, 10 crops
4 robots: 5 days, 12 crops
8 robots: 5 days, 16 crops
16 robots: 5 days, 16 crops*
Answer: 5 days

*note that there is no situation where more robots than required crops saves us a day, because math

Example: Plant 20 crops
0 days mult : 1 robot  : 0 + 20 = 20 days, 20 crops
1 day  mult : 2 robots : 1 + 10 = 11 days, 20 crops
2 days mult : 4 robots : 2 + 5  = 7  days, 20 crops
3 days mult : 8 robots : 3 + 3  = 6  days, 24 crops
4 days mult : 16 robots: 4 + 2  = 6  days, 32 crops
5 days mult : 32 robots: 5 + 1  = 6  days, 32 crops

Example: Plant 30 crops
0 days mult : 1 robot  : 0 + 30 = 30 days, 30 crops
1 day  mult : 2 robots : 1 + 15 = 16 days, 30 crops
2 days mult : 4 robots : 2 + 8  = 10 days, 32 crops
3 days mult : 8 robots : 3 + 4  = 7  days, 32 crops
4 days mult : 16 robots: 4 + 2  = 6  days, 32 crops
5 days mult : 32 robots: 5 + 1  = 6  days, 32 crops



days = x + y
crops = (2^x)y
y = target/(2^x)
 */

public class CloningRobots {

    Integer numberOfRobots = 1;
    Integer numberOfCrops = 0;

    public Integer findFewestDays(Integer cropGoal){
        Integer days = Integer.MAX_VALUE;
        Integer counter = 0;
        // i represents the days spent multiplying robots
        for (int i = 1; numberOfRobots > cropGoal; i++){
            counter = Math.round(cropGoal)
            }
        }
        return days;
    }

    public void goForthAndMultiply(){
        this.numberOfRobots *= 2;
    }

    public void sowTheSeeds(){
        this.numberOfCrops += numberOfRobots;
    }


    public Integer getNumberOfRobots() {
        return numberOfRobots;
    }

    public void setNumberOfRobots(Integer numberOfRobots) {
        this.numberOfRobots = numberOfRobots;
    }

    public Integer getNumberOfCrops() {
        return numberOfCrops;
    }

    public void setNumberOfCrops(Integer numberOfCrops) {
        this.numberOfCrops = numberOfCrops;
    }

}
