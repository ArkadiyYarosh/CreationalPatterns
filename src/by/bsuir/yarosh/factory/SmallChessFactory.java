package by.bsuir.yarosh.factory;

import by.bsuir.yarosh.entity.Color;
import by.bsuir.yarosh.entity.Figure;
import by.bsuir.yarosh.entity.Size;

import java.util.List;

/**
 * Created by Lemm on 16.11.14.
 */
public class SmallChessFactory extends AbstractFactory implements IChessFactory {
    @Override
    public List<Figure> getFigures(Color color) {
        return getFigure(Size.SMALL, color);
    }
}
