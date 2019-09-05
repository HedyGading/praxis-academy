/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasus04;

public class Deposit extends ATMMachine
{
    static double deposit;
    public void setDeposit(double d)
    {
        deposit = d;
    }
    public static double getDeposit()
    {
        return deposit;
    }
}