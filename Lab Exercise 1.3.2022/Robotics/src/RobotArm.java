/**
 * @(#)RobotArm.java
 *
 *
 * @Author: nmessa 
 * @version 1.00 2022/1/3
 */


public interface RobotArm {
    void moveUp( double rate, double howFar );
	void moveDown( double rate, double howFar );
	void twistLeft(double deg);
	void twistRight(double deg);   
}