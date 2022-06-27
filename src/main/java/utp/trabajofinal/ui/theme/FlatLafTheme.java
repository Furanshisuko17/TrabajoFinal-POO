package utp.trabajofinal.ui.theme;

import com.formdev.flatlaf.FlatDarkLaf;

public class FlatLafTheme extends FlatDarkLaf{
    public static final String NAME = "FlatLafTheme";
    
    public static boolean setup(){
        return setup(new FlatLafTheme() );
    }
    
    public static void installLafInfo() {
		installLafInfo( NAME, FlatDarkLaf.class );
	}
    
    @Override
    public String getName(){
        return NAME;
    }
    

}
