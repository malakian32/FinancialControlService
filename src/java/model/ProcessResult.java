/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Silex RPR
 */
public enum ProcessResult {
    ERROR("Error"),
    COMPLETED("Completed");
    
    private final String stringValue;
    private ProcessResult(final String s) { stringValue = s; }
    @Override
    public String toString() { return stringValue; }       
}
