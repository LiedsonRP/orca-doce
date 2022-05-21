/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 *
 * @author lieds
 */
public class DbIntegrityException extends RuntimeException {
    public DbIntegrityException (String msg) {
        super(msg);
    }
}
