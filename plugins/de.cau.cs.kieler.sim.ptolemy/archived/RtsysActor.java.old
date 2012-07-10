package ptolemy.actor.kiel;

import ptolemy.actor.TypedAtomicActor;
import ptolemy.actor.TypedIOPort;
import ptolemy.data.IntToken;
import ptolemy.data.Token;
import ptolemy.kernel.CompositeEntity;
import ptolemy.kernel.util.IllegalActionException;
import ptolemy.kernel.util.NameDuplicationException;

public class RtsysActor extends TypedAtomicActor {
    public RtsysActor(CompositeEntity container, String name)
            throws NameDuplicationException, IllegalActionException {
        super(container, name);

        out   = new TypedIOPort(this, "out", false, true);
        in1   = new TypedIOPort(this, "in1", true, false);
        in2   = new TypedIOPort(this, "in2", true, false);

        _attachText("_iconDescription",
        		//"<svg><rect x=\"+346\" y=\"+507\" width=\"60\" height=\"50\" style=\"fill:white\" />" +
        		//"<rect width=\"42.179585\" height=\"10.368729\" x=\"354.04678\" y=\"511.17493\" style=\"fill:red;stroke:red;stroke:red\" /> <rect width=\"41.273579\" height=\"5.9393687\" x=\"354.55011\" y=\"521.2417\" style=\"fill:red;stroke:red\" /> <rect width=\"39.864239\" height=\"2.0133452\" x=\"355.15411\" y=\"526.97974\" style=\"fill:red;stroke:red\" /> <rect width=\"38.454895\" height=\"2.7180161\" x=\"356.06012\" y=\"528.79175\" style=\"fill:red;stroke:red\" /> <rect width=\"37.146221\" height=\"2.8186834\" x=\"356.7648\" y=\"531.00641\" style=\"fill:red;stroke:red\" /> <rect width=\"34.528873\" height=\"3.4226871\" x=\"357.87213\" y=\"533.42242\" style=\"fill:red;stroke:red\" /> <rect width=\"32.012192\" height=\"2.1140127\" x=\"358.97946\" y=\"536.6438\" style=\"fill:red;stroke:red\" /> <rect width=\"29.294174\" height=\"2.4160144\" x=\"360.69083\" y=\"538.15381\" style=\"fill:red;stroke:red\" /> <rect width=\"25.670153\" height=\"2.9193506\" x=\"362.50284\" y=\"540.26782\" style=\"fill:red;stroke:red\" /> <rect width=\"23.254139\" height=\"2.0133452\" x=\"363.71085\" y=\"542.78448\" style=\"fill:red;stroke:red\" /> <rect width=\"19.932119\" height=\"2.5166817\" x=\"365.0195\" y=\"543.69049\" style=\"fill:red;stroke:red\" /> <rect width=\"16.006096\" height=\"2.3153472\" x=\"367.63687\" y=\"545.70386\" style=\"fill:red;stroke:red\" /> <rect width=\"12.986077\" height=\"2.3153472\" x=\"369.0462\" y=\"547.11316\" style=\"fill:red;stroke:red\" /> <rect width=\"10.469396\" height=\"2.21468\" x=\"369.95221\" y=\"548.52252\" style=\"fill:red;stroke:red\" /> <rect width=\"7.2480431\" height=\"1.6106763\" x=\"371.76422\" y=\"549.93182\" style=\"fill:red;stroke:red\" /> <rect width=\"3.2213526\" height=\"1.4093417\" x=\"373.67688\" y=\"551.34119\" style=\"fill:red;stroke:red\" /> <rect width=\"9.7647247\" height=\"8.9593868\" x=\"356.52753\" y=\"513.99048\" style=\"fill:white;stroke:white\" /> <rect width=\"30.099512\" height=\"8.9593868\" x=\"360.70523\" y=\"519.77875\"  style=\"fill:white;stroke:white\" /> <rect width=\"9.7647247\" height=\"8.9593868\" x=\"370.36929\" y=\"514.04077\"  style=\"fill:white;stroke:white\" /> <rect width=\"8.7647247\" height=\"8.9593868\" x=\"383.8587\" y=\"514.14142\"  style=\"fill:white;stroke:white\" /> <rect width=\"23.858141\" height=\"8.9593868\" x=\"363.42325\" y=\"526.62415\"  style=\"fill:white;stroke:white\" /> <rect width=\"16.207428\" height=\"8.9593868\" x=\"367.04727\" y=\"532.36218\"  style=\"fill:white;stroke:white\" /> <rect width=\"6.1407013\" height=\"8.9593868\" x=\"372.08063\" y=\"537.89893\"  style=\"fill:white;stroke:white\" /> <rect width=\"4.0266905\" height=\"3.7246888\" x=\"366.49359\" y=\"524.25848\"  style=\"fill:black;stroke:black\" /> <rect width=\"4.0266905\" height=\"3.7246888\" x=\"379.58035\" y=\"524.20813\" style=\"fill:black;stroke:black\" /> <rect width=\"4.0266905\" height=\"3.7246888\" x=\"368.60764\" y=\"526.92615\"  style=\"fill:black;stroke:black\" /> <rect width=\"4.0266905\" height=\"3.7246888\" x=\"371.7283\" y=\"527.83215\"  style=\"fill:black;stroke:black\" /> <rect width=\"4.0266905\" height=\"3.7246888\" x=\"375.05032\" y=\"527.9328\"  style=\"fill:black;stroke:black\" /> <rect width=\"4.0266905\" height=\"3.7246888\" x=\"377.16434\" y=\"526.72479\" style=\"fill:black;stroke:black\" />" +
        		"<svg><rect width=\"60\" height=\"55\" x=\"+0.11029591\" y=\"-4\" id=\"rect4\" style=\"fill:white;stroke:black\" /><rect width=\"44.179585\" height=\"12.368729\" x=\"8.8751001\" y=\"1.3841918\" id=\"rect5\" style=\"fill:red;stroke:red\" /><rect width=\"42.273579\" height=\"5.9393687\" x=\"9.3784266\" y=\"13.450964\" id=\"rect7\" style=\"fill:red;stroke:red\" /><rect width=\"39.864239\" height=\"2.0133452\" x=\"9.9824305\" y=\"19.189001\" id=\"rect9\" style=\"fill:red;stroke:red\" /><rect width=\"38.454895\" height=\"2.7180161\" x=\"10.888436\" y=\"21.001013\" id=\"rect11\" style=\"fill:red;stroke:red\" /><rect width=\"37.146221\" height=\"2.8186834\" x=\"11.59311\" y=\"23.215673\" id=\"rect13\" style=\"fill:red;stroke:red\" /><rect width=\"34.528873\" height=\"3.4226871\" x=\"12.70044\" y=\"25.631689\" id=\"rect15\" style=\"fill:red;stroke:red\" /><rect width=\"32.012192\" height=\"2.1140127\" x=\"13.807786\" y=\"28.853064\" id=\"rect17\" style=\"fill:red;stroke:red\" /><rect width=\"29.294174\" height=\"2.4160144\" x=\"15.519143\" y=\"30.363073\" id=\"rect19\" style=\"fill:red;stroke:red\" /><rect width=\"25.670153\" height=\"2.9193506\" x=\"17.331154\" y=\"32.477089\" id=\"rect21\" style=\"fill:red;stroke:red\" /><rect width=\"23.254139\" height=\"2.0133452\" x=\"18.539162\" y=\"34.993752\" id=\"rect23\" style=\"fill:red;stroke:red\" /><rect width=\"19.932119\" height=\"2.5166817\" x=\"19.847816\" y=\"35.899757\" id=\"rect25\" style=\"fill:red;stroke:red\" /><rect width=\"16.006096\" height=\"2.3153472\" x=\"22.465187\" y=\"37.913124\" id=\"rect27\" style=\"fill:red;stroke:red\" /><rect width=\"12.986077\" height=\"2.3153472\" x=\"23.874519\" y=\"39.322426\" id=\"rect29\" style=\"fill:red;stroke:red\" /><rect width=\"10.469396\" height=\"2.21468\" x=\"24.780525\" y=\"40.731789\" id=\"rect31\" style=\"fill:red;stroke:red\" /><rect width=\"7.2480431\" height=\"1.6106763\" x=\"26.592537\" y=\"42.14109\" id=\"rect33\" style=\"fill:red;stroke:red\" /><rect width=\"3.2213526\" height=\"1.4093417\" x=\"28.505196\" y=\"43.550453\" id=\"rect35\" style=\"fill:red;stroke:red\" /><rect width=\"9.7647247\" height=\"8.9593868\" x=\"11.355844\" y=\"6.1997433\" id=\"rect37\" style=\"fill:white;stroke:white\" /><rect width=\"30.099512\" height=\"8.9593868\" x=\"15.533547\" y=\"11.988012\" id=\"rect39\" style=\"fill:white;stroke:white\" /><rect width=\"9.7647247\" height=\"8.9593868\" x=\"25.197609\" y=\"6.2500362\" id=\"rect41\" style=\"fill:white;stroke:white\" /><rect width=\"8.7647247\" height=\"8.9593868\" x=\"38.687019\" y=\"6.3506832\" id=\"rect43\" style=\"fill:white;stroke:white\" /><rect width=\"23.858141\" height=\"8.9593868\" x=\"18.251564\" y=\"18.83341\" id=\"rect45\" style=\"fill:white;stroke:white\" /><rect width=\"16.207428\" height=\"8.9593868\" x=\"21.875587\" y=\"24.571447\" id=\"rect47\" style=\"fill:white;stroke:white\" /><rect width=\"6.1407013\" height=\"8.9593868\" x=\"26.908943\" y=\"30.108191\" id=\"rect49\" style=\"fill:white;stroke:white\" /><rect width=\"4.0266905\" height=\"3.7246888\" x=\"21.321907\" y=\"16.467749\" id=\"rect51\" style=\"fill:black;stroke:black\" /><rect width=\"4.0266905\" height=\"3.7246888\" x=\"34.408669\" y=\"16.417395\" id=\"rect53\" style=\"fill:black;stroke:black\" /><rect width=\"4.0266905\" height=\"3.7246888\" x=\"23.435951\" y=\"19.135412\" id=\"rect55\" style=\"fill:black;stroke:black\" /><rect width=\"4.0266905\" height=\"3.7246888\" x=\"26.556618\" y=\"20.041418\" id=\"rect57\" style=\"fill:black;stroke:black\" /><rect width=\"4.0266905\" height=\"3.7246888\" x=\"29.878639\" y=\"20.142065\" id=\"rect59\" style=\"fill:black;stroke:black\" /><rect width=\"4.0266905\" height=\"3.7246888\" x=\"31.992653\" y=\"18.934057\" id=\"rect61\" style=\"fill:black;stroke:black\" /></svg>"
        		//"</svg>"
        		//"<svg> <rect x=\"0.11029591\" y=\"-7.8537886e-07\" width=\"60\" height=\"40\" style=\"fill:white\" id=\"rect4\" /> <rect style=\"fill:blue\" width=\"4.3014708\" height=\"7.2794118\" x=\"42.794117\" y=\"27.205883\" id=\"rect46\" /> <rect style=\"fill:blue\" width=\"8.1617651\" height=\"4.1911764\" x=\"40.808823\" y=\"28.970589\" id=\"rect44\" /> <rect style=\"fill:blue\" width=\"4.3014708\" height=\"7.2794118\" x=\"26.80147\" y=\"27.095589\" id=\"rect40\" /> <rect style=\"fill:blue\" width=\"8.1617651\" height=\"4.1911764\" x=\"24.816175\" y=\"28.860294\" id=\"rect38\" /> <rect style=\"fill:black\" width=\"17.678572\" height=\"2.8571427\" x=\"8.8602943\" y=\"8.8550434\" id=\"rect6\" /> <rect style=\"fill:black\" width=\"17.678572\" height=\"2.8571427\" x=\"8.4821415\" y=\"26.357141\" id=\"rect8\" /> <rect style=\"fill:blue\" width=\"8.1617651\" height=\"4.1911764\" x=\"14.227942\" y=\"28.970589\" id=\"rect30\" /> <rect style=\"fill:black\" width=\"14.642858\" height=\"7.8886552\" x=\"11.875\" y=\"11.575629\" id=\"rect10\" /> <rect style=\"fill:blue\" width=\"4.3014708\" height=\"7.2794118\" x=\"16.213236\" y=\"27.205883\" id=\"rect32\" /> <rect style=\"fill:black\" width=\"39.642857\" height=\"11.060924\" x=\"11.875\" y=\"18.046219\" id=\"rect12\" /> <rect style=\"fill:#000000\" width=\"4.7220092\" height=\"9.9465933\" x=\"46.669132\" y=\"8.8365469\" id=\"rect14\" /> <rect style=\"fill:grey\" width=\"11.454833\" height=\"2.6785715\" x=\"37.284664\" y=\"3.6985292\" id=\"rect16\" /> <rect style=\"fill:darkgrey\" width=\"10\" height=\"3.3928571\" x=\"41.42857\" y=\"6.0357141\" id=\"rect18\" /> <rect style=\"fill:black\" width=\"3.5714285\" height=\"3.3928571\" x=\"38.597687\" y=\"14.873949\" id=\"rect20\" /> <rect style=\"fill:black\" width=\"2.1428571\" height=\"5\" x=\"51.42857\" y=\"24.178572\" id=\"rect22\" /> <rect style=\"fill:black\" width=\"1.7857143\" height=\"3.2142856\" x=\"53.214287\" y=\"25.964285\" id=\"rect24\" /> <rect style=\"fill:white\" width=\"9.1499014\" height=\"4.738061\" x=\"14.703809\" y=\"12.331933\" id=\"rect26\" /> <rect style=\"fill:blue\" width=\"6.6176472\" height=\"6.397059\" x=\"15\" y=\"27.647058\" id=\"rect28\" /> <rect style=\"fill:grey\" width=\"10\" height=\"3.3928571\" x=\"33.051472\" y=\"5.7521009\" id=\"rect34\" /> <rect style=\"fill:blue\" width=\"6.6176472\" height=\"6.397059\" x=\"25.588234\" y=\"27.536764\" id=\"rect36\" /> <rect style=\"fill:blue\" width=\"6.6176472\" height=\"6.397059\" x=\"41.580879\" y=\"27.647058\" id=\"rect42\" /></svg>\n"
        );
    }

    public TypedIOPort in1;
    public TypedIOPort in2;
    public TypedIOPort out;


    public void fire() throws IllegalActionException {

		System.out.print("TEST1 ... ");
    	if(in2.hasToken(0)) {
    		Token token = in2.get(0);
    		out.send(0, new IntToken(0));
    		System.out.println("FIRE SECOND");
            super.fire();
    		return;
    	}

		System.out.print("TEST2 ... ");
    	if (in1.hasToken(0)) {
    		Token token = in1.get(0);
    		out.send(0, new IntToken(0));
    		System.out.println("FIRE FIRST");
            super.fire();
            return;
    	}

        super.fire();
    }


    public void initialize() throws IllegalActionException {
        super.initialize();
    }


    public void wrapup() throws IllegalActionException {
    	super.wrapup();
    }

}
