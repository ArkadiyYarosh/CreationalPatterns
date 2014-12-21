package by.bsuir.yarosh.factory;

import by.bsuir.yarosh.entity.Color;
import by.bsuir.yarosh.entity.Figure;

import java.util.List;

/**
 * Created by Lemm on 16.11.14.
 */
public interface IChessFactory {
    List<Figure> getFigures(Color color);
}
