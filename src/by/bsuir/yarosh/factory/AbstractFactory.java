package by.bsuir.yarosh.factory;

import by.bsuir.yarosh.config.Configuration;
import by.bsuir.yarosh.entity.Color;
import by.bsuir.yarosh.entity.Figure;
import by.bsuir.yarosh.entity.Size;
import by.bsuir.yarosh.entity.Type;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lemm on 16.11.14.
 */
public class AbstractFactory {
    protected List<Figure> getFigure(Size size, Color color) {
        List<Figure> figures = new ArrayList<Figure>();
        Configuration configuration = Configuration.getInstance();

        for(int i=0; i<configuration.getKingCount(); i++) {
            figures.add(new Figure(Type.KING, color, size));
        }

        for(int i=0; i<configuration.getQueenCount(); i++) {
            figures.add(new Figure(Type.QUEEN, color, size));
        }

        for(int i=0; i<configuration.getElephantCount(); i++) {
            figures.add(new Figure(Type.ELEPHANT, color, size));
        }

        for(int i=0; i<configuration.getHorseCount(); i++) {
            figures.add(new Figure(Type.HORSE, color, size));
        }

        for(int i=0; i<configuration.getRookCount(); i++) {
            figures.add(new Figure(Type.ROOK, color, size));
        }

        for(int i=0; i<configuration.getPawnCount(); i++) {
            figures.add(new Figure(Type.PAWN, color, size));
        }

        return figures;
    }
}
