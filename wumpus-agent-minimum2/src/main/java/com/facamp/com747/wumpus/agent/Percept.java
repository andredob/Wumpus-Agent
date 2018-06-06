package com.facamp.com747.wumpus.agent;

public class Percept {
	String state;
	boolean stench;
	boolean breeze;
	boolean scream;
	boolean glitter;
	boolean bump;
        boolean soundOfRockFallingOnTheGround;
        boolean rockOnTheGround;
	int t;
	double points;
	
	public Percept(boolean stench, boolean breeze, boolean scream, boolean bump, boolean glitter,boolean soundOfRock, int t, double point) {
		super();
		this.stench = stench;
		this.breeze = breeze;
		this.scream = scream;
		this.bump = bump;
		this.glitter = glitter;
                this.soundOfRockFallingOnTheGround = soundOfRock;
		this.t = t;
		this.points = point;
	}

        public boolean isSoundOfRock() {
            return soundOfRockFallingOnTheGround;
        }

        public void setSoundOfRock(boolean soundOfRock) {
            this.soundOfRockFallingOnTheGround = soundOfRock;
        }

	public Percept() {
	}

	public boolean isStench() {
		return stench;
	}

	public void setStench(boolean stench) {
		this.stench = stench;
	}

	public boolean isBreeze() {
		return breeze;
	}

	public void setBreeze(boolean breeze) {
		this.breeze = breeze;
	}

	public boolean isScream() {
		return scream;
	}

	public void setScream(boolean scream) {
		this.scream = scream;
	}

	public boolean isBump() {
		return bump;
	}

	public void setBump(boolean bump) {
		this.bump = bump;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double point) {
		this.points = point;
	}

	@Override
	public String toString() {
		return "Percept [state=" + state + ", stench=" + stench + ", breeze=" + breeze + ", scream=" + scream + ", bump=" + bump + ", t=" + t + ", points=" + points + "]";
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public boolean isGlitter() {
		return glitter;
	}

	public void setGlitter(boolean glitter) {
		this.glitter = glitter;
	}

}
