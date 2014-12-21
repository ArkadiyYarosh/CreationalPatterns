package by.bsuir.yarosh.config;

import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class Configuration {
	public static final String BUNDLE_NAME = "config";
    public static final String QUEEN = "queen";
    public static final String KING = "king";
    public static final String HORSE = "horse";
    public static final String ELEPHANT = "elephant";
    public static final String ROOK = "rook";
    public static final String PAWN = "pawn";

    private static ResourceBundle bundle = PropertyResourceBundle.getBundle(BUNDLE_NAME);
	
	private static Configuration instance;

	private int queenCount;
	private int kingCount;
	private int horseCount;
	private int elephantCount;
	private int rookCount;
	private int pawnCount;

	private Configuration() {
        queenCount = Integer.parseInt(bundle.getString(QUEEN));
        kingCount = Integer.parseInt(bundle.getString(KING));
        horseCount = Integer.parseInt(bundle.getString(HORSE));
        elephantCount = Integer.parseInt(bundle.getString(ELEPHANT));
        rookCount = Integer.parseInt(bundle.getString(ROOK));
        pawnCount = Integer.parseInt(bundle.getString(PAWN));
	}
	
	public static synchronized Configuration getInstance() {
		if(instance == null) {
			instance = new Configuration();
		}
		
		return instance;
	}

    public int getQueenCount() {
        return queenCount;
    }

    public int getKingCount() {
        return kingCount;
    }

    public int getHorseCount() {
        return horseCount;
    }

    public int getElephantCount() {
        return elephantCount;
    }

    public int getRookCount() {
        return rookCount;
    }

    public int getPawnCount() {
        return pawnCount;
    }
}
