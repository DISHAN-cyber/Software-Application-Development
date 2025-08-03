/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package lk.jiat.smarttrade.entity;

public enum Status {
    ACTIVE(1), INACTIVE(2), PENDING(3), DELIVERED(4), BLOCKED(5);
    private final int id;

    private Status(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
