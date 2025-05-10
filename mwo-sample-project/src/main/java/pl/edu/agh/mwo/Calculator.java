package pl.edu.agh.mwo;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Pit> pitStop;

    public Calculator(ArrayList<Pit> pitStop) {
        this.pitStop = pitStop;
    }


    protected int getPitStopNumber() {
        return pitStop.size();
    }

    protected Pit getPitStopWithLongestTime() {

       double time = 0;
        for (Pit pit : pitStop) {
            double tempTime = pit.getPitDuration();
            if(tempTime > time) {
                return pit;
            }
        }

        return null;
    }

    protected int getDriverIdByLongestPitStopTime() {
        Pit newPit = getPitStopWithLongestTime();
        return newPit.getDriverNumber();
    }

    protected double getPitStopAverageTime(){
        double time = 0;
        for (Pit pit : pitStop) {
            time += pit.getPitDuration();
        }
        return time / pitStop.size();
    }


}


