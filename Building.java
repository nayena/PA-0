package main;


public class Building {

	public Building(int numFloors) {
		throw new UnsupportedOperationException();
	}
	
	public boolean enterElevatorRequest(Person person, int floor) {
		   if (floor > 0 && floor <= floors.length) {
            elevator.createJob(person, floor);
            person.setLocation("Waiting to be serviced");
            return true;
        }
        return false;
    }
	}
	
	public void startElevator() {

		elevator.processAllJobs ();

	}
	
	public void enterFloor(Person person, int floor) {
		if (floor == 0 ) {
            looby.enteredFloor(person);

	} else if  (floor > 0  && floor  <=   floors.length) {
        floors[floor - 1].enteredFloor(person); 
    }
    }

    public  String to String () {
        return "Building  with " +  floors.length +  "floors and " + 
        elevator.toString();
    }
}