package by.bsuir.yarosh.controller;

import by.bsuir.yarosh.entity.Color;
import by.bsuir.yarosh.factory.BigChessFactory;
import by.bsuir.yarosh.factory.IChessFactory;
import by.bsuir.yarosh.factory.SmallChessFactory;

import java.util.List;

/**
 * Created by Lemm on 16.11.14.
 */
public class Controller {
    public static void main(String... args) {
        IChessFactory[] factory = { new BigChessFactory(), new SmallChessFactory()};

        for(IChessFactory key: factory) {
            printList(key.getFigures(Color.BLACK));
            printList(key.getFigures(Color.WHITE));
        }
    }

    private static void printList(List list) {
        for(Object o: list) {
            System.out.println(o.toString());
        }
        System.out.println("--------------------------------------------");
    }
}
