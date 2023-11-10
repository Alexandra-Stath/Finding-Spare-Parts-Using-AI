package t21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App 
{   protected String[] partsName = new String[253];

    public App() {
        partsName[0] = "1.1 UPPER CONTROL ARM";
        partsName[1] = "1.2 UPPER BALL JOINT";
        partsName[2] = "1.3 COIL SPRING";
        partsName[3] = "1.4 SNOCK ABSORBER";
        partsName[4] = "1.5 LOWER BALL JOINT";
        partsName[5] = "1.6 LOWER CONTROL ARM";
        partsName[6] = "1.7 CONTROL ARM BUSHINGS";
        partsName[7] = "1.8 STABILIZER LINK";
        partsName[8] = "1.9 IDLER ARM";
        partsName[9] = "1.10 INNER TIE-ROD END";
        partsName[10] = "1.11 CENTER LINK";
        partsName[11] = "1.12 PITMAN ARM";
        partsName[12] = "1.13 ADJUSTING SLEEVE";
        partsName[13] = "1.14 OUTER TIE-ROD END";
        partsName[14] = "1.15 STEERING KNUCKLE";
        partsName[15] = "1.16 POWER STEERING PUMP";
        partsName[16] = "1.17 POWER STEERING GEARBOX";
        partsName[17] = "1.18 ANTI-SWAY BAR";
        partsName[18] = "1.19 BALL JOINT";
        partsName[19] = "1.20 UPPER MOUNTING PLATE-BEARING";
        partsName[20] = "1.21 MACPHERSON STRUT";
        partsName[21] = "1.22 BELLOWS";
        partsName[22] = "1.23 RACK-PINION UNIT";
        partsName[23] = "1.24 RACK-PINION BUSHINGS";
        partsName[24] = "1.25 INNER SCOKET ASSEMBLY";
        partsName[25] = "1.26 WHEEL HUB";
        partsName[26] = "1.27 WHEEL BEARING";
        partsName[27] = "1.28 POWER STEERING";
        partsName[28] = "2.1 SPIGOT BEARING";
        partsName[29] = "2.2 RETAINING SPRING WITH PREFORMED FINGERS";
        partsName[30] = "2.3 RELEAS RING";
        partsName[31] = "2.4 RETAINING SPRING";
        partsName[32] = "2.5 BALL PIN FOR CLUCH FORK";
        partsName[33] = "2.6 FLYWHEEL";
        partsName[34] = "2.7 DRIVE DISC";
        partsName[35] = "2.8 PRESSURE PLATE";
        partsName[36] = "2.9 INNER FULCRUM RING";
        partsName[37] = "2.10 OUTER FULCRUM RING";
        partsName[38] = "2.11 CLUTCH COVER";
        partsName[39] = "2.12 RELEASE FORK";
        partsName[40] = "2.13 RETURN SPRING OF RELEASE FORK";
        partsName[41] = "2.14 RELEASE BEARING";
        partsName[42] = "2.15 DIAPHRAGM SPRING";
        partsName[43] = "2.16 PILOT BUSHING";
        partsName[44] = "2.17 BELLHOUSING";
        partsName[45] = "";
        partsName[46] = "";
        partsName[47] = "";
        partsName[48] = "";
        partsName[49] = "";
        partsName[50] = "";
        partsName[51] = "";
        partsName[52] = "";
        partsName[53] = "";
        partsName[54] = "";
        partsName[55] = "";
        partsName[56] = "";
        partsName[57] = "";
        partsName[58] = "";
        partsName[59] = "";
        partsName[60] = "";
        partsName[61] = "";
        partsName[62] = "";
        partsName[63] = "";
        partsName[64] = "";
        partsName[65] = "";
        partsName[66] = "";
        partsName[67] = "";
        partsName[68] = "";
        partsName[69] = "";
        partsName[70] = "";
        partsName[71] = "";
        partsName[72] = "";
        partsName[73] = "";
        partsName[74] = "";
        partsName[75] = "";
        partsName[76] = "";
        partsName[77] = "";
        partsName[78] = "";
        partsName[79] = "";
        partsName[80] = "";
        partsName[81] = "";
        partsName[82] = "";
        partsName[83] = "";
        partsName[84] = "";
        partsName[85] = "";
        partsName[86] = "";
        partsName[87] = "";
        partsName[88] = "";
        partsName[89] = "";
        partsName[90] = "";
        partsName[91] = "";
        partsName[92] = "";
        partsName[93] = "";
        partsName[94] = "";
        partsName[95] = "";
        partsName[96] = "";
        partsName[97] = "";
        partsName[98] = "";
        partsName[99] = "";
        partsName[100] = "";
        partsName[101] = "";
        partsName[102] = "";
        partsName[103] = "";
        partsName[104] = "";
        partsName[105] = "";
        partsName[106] = "";
        partsName[107] = "";
        partsName[108] = "";
        partsName[109] = "";
        partsName[110] = "";
        partsName[111] = "";
        partsName[112] = "";
        partsName[113] = "";
        partsName[114] = "";
        partsName[115] = "";
        partsName[116] = "";
        partsName[117] = "";
        partsName[118] = "";
        partsName[119] = "";
        partsName[120] = "";
        partsName[121] = "";
        partsName[122] = "";
        partsName[123] = "";
        partsName[124] = "";
        partsName[125] = "";
        partsName[126] = "";
        partsName[127] = "";
        partsName[128] = "";
        partsName[129] = "";
        partsName[130] = "";
        partsName[131] = "";
        partsName[132] = "";
        partsName[133] = "";
        partsName[134] = "";
        partsName[135] = "";
        partsName[136] = "";
        partsName[137] = "";
        partsName[138] = "";
        partsName[139] = "";
        partsName[140] = "";
        partsName[141] = "";
        partsName[142] = "";
        partsName[143] = "";
        partsName[144] = "";
        partsName[145] = "";
        partsName[146] = "";
        partsName[147] = "";
        partsName[148] = "";
        partsName[149] = "";
        partsName[150] = "";
        partsName[151] = "";
        partsName[152] = "";
        partsName[153] = "";
        partsName[154] = "";
        partsName[155] = "";
        partsName[156] = "";
        partsName[157] = "";
        partsName[158] = "";
        partsName[159] = "";
        partsName[160] = "";
        partsName[161] = "";
        partsName[162] = "";
        partsName[163] = "";
        partsName[164] = "";
        partsName[165] = "";
        partsName[166] = "";
        partsName[167] = "";
        partsName[168] = "";
        partsName[169] = "";
        partsName[170] = "";
        partsName[171] = "";
        partsName[172] = "";
        partsName[173] = "";
        partsName[174] = "";
        partsName[175] = "";
        partsName[176] = "";
        partsName[177] = "";
        partsName[178] = "";
        partsName[179] = "";
        partsName[180] = "";
        partsName[181] = "";
        partsName[182] = "";
        partsName[183] = "";
        partsName[184] = "";
        partsName[185] = "";
        partsName[186] = "";
        partsName[187] = "";
        partsName[188] = "";
        partsName[189] = "";
        partsName[190] = "";
        partsName[191] = "";
        partsName[192] = "";
        partsName[193] = "";
        partsName[194] = "";
        partsName[195] = "";
        partsName[196] = "";
        partsName[197] = "";
        partsName[198] = "";
        partsName[199] = "";
        partsName[200] = "";
        partsName[201] = "";
        partsName[202] = "";
        partsName[203] = "";
        partsName[204] = "";
        partsName[205] = "";
        partsName[206] = "";
        partsName[207] = "";
        partsName[208] = "";
        partsName[209] = "";
        partsName[210] = "";
        partsName[211] = "";
        partsName[212] = "";
        partsName[213] = "";
        partsName[214] = "";
        partsName[215] = "";
        partsName[216] = "";
        partsName[217] = "";
        partsName[218] = "";
        partsName[219] = "";
        partsName[220] = "";
        partsName[221] = "";
        partsName[222] = "";
        partsName[223] = "";
        partsName[224] = "";
        partsName[225] = "";
        partsName[226] = "";
        partsName[227] = "";
        partsName[228] = "";
        partsName[229] = "";
        partsName[230] = "";
        partsName[231] = "";
        partsName[232] = "";
        partsName[233] = "";
        partsName[234] = "";
        partsName[235] = "";
        partsName[236] = "";
        partsName[236] = "";
        partsName[237] = "";
        partsName[238] = "";
        partsName[239] = "";
        partsName[240] = "";
        partsName[241] = "";
        partsName[242] = "";
        partsName[243] = "";
        partsName[244] = "";
        partsName[245] = "";
        partsName[246] = "";
        partsName[247] = "";
        partsName[248] = "";
        partsName[249] = "";
        partsName[250] = "";
        partsName[251] = "";
        partsName[252] = "";
    }
    public static void main( String[] args ) throws InputMismatchException {
    
        int key1 = 0;
        Scanner input = new Scanner(System.in);

        for(;;) {
            System.out.printf("Please enter \"1\" or \"2\" to choose an option:\n1) MAIN MENU\n2) SEARCH BAR\n");
            do {
                try {
                    key1 = input.nextInt();
                } catch (InputMismatchException e) {
                    System.out.printf("ERROR: Inappropriate argument passed into the system\nplease enter one " + 
                    "of the accepted values ass following:\n \"1\" or\"2\"\n");
                    input.nextLine();
                }
                if (key1 == 0) {
                    continue;
                }else if (key1 != 1 && key1 != 2) {
                    System.out.printf("Please enter one of the accepted values ass following:\n \"1\" or\"2\"\n");
                } 
            }
            while (key1 != 1 && key1 != 2);
                
            if (key1 == 1) {
                int key2 = 0;
                System.out.printf("Please enter \"1\", \"2\", \"3\", \"4\", \"5\" or \"6\" to select a category:\n" +
                "1) STEERING PARTS\n2) CLUTCH PARTS\n3) ENGINE PARTS\n4) PROPELLER SHAFT\n5) BRAKE PARTS\n6) EXTRA");
                do {
                    try {
                    key2 = input.nextInt();
                    } catch (InputMismatchException e) {
                    System.out.printf("ERROR: Inappropriate argument passed into the system\nplease enter one " + 
                    "of the accepted values ass following:\n \"1\", \"2\", \"3\", \"4\", \"5\" or \"6\"\n");
                    input.nextLine();
                    }
                    if (key2 < 1 && key2 > 6) {
                        System.out.println("Please enter one of the accepted values ass following:\n" +
                        "\"1\", \"2\", \"3\", \"4\", \"5\", \"6\"");
                    }
                }
                while (key2 < 1 || key2 > 6);
                System.out.println("Please enter the number of the part you want to select.");
                String key3;
                Scanner k = new Scanner(System.in);
                if (key2 == 1) {
                    
                }else if (key2 == 2) {
                    System.out.printf("1.1 UPPER CONTROL ARM\n1.2 UPPER BALL JOINT\n1.3 COIL SPRING\n" +
                    "1.4 SNOCK ABSORBER\n1.5 LOWER BALL JOINT\n1.6 LOWER CONTROL ARM\n" +
                    "1.7 CONTROL ARM BUSHINGS\n1.8 STABILIZER LINK\n1.9 IDLER ARM\n" +
                    "1.10 INNER TIE-ROD END\n1.11 CENTER LINK\n1.12 PITMAN ARM\n" +
                    "1.13 ADJUSTING SLEEVE\n1.14 OUTER TIE-ROD END\n1.15 STEERING KNUCKLE\n" +
                    "1.16 POWER STEERING PUMP\n1.17 POWER STEERING GEARBOX\n" +
                    "1.18 ANTI-SWAY BAR\n1.19 BALL JOINT\n1.20 UPPER MOUNTING PLATE-BEARING\n" +
                    "1.21 MACPHERSON STRUT\n1.22 BELLOWS\n1.23 RACK-PINION UNIT\n1.24 RACK-PINION BUSHINGS\n" +
                    "1.25 INNER SCOKET ASSEMBLY\n1.26 WHEEL HUB\n1.27 WHEEL BEARING\n1.28 POWER STEERING\n");
                }else if (key2 == 3) {
                    //
                }else if (key2 == 4) {
                    //
                }else if (key2 == 5) {
                    //
                }else if (key2 == 6) {
                    //
                }
                key3 = k.nextLine();
                input.close();
                k.close();
                return;
            } else {
                input.close();
                return;
            }
        }
    }
}
