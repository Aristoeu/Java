package StandardScore;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.00910929143372252d, 0.30711943793911006d, (-258736.8504784611d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.1517885680153465E-6d + "'", double3 == 1.1517885680153465E-6d);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) '#', (-0.0031500412764029324d), 0.30711943793911006d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 113.97243455562777d + "'", double3 == 113.97243455562777d);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 0, 10.285714285714286d, 0.44989714344586235d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-22.862368511464002d) + "'", double3 == (-22.862368511464002d));
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(244.49669813176985d, 0.23007705294454095d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.442666210788253d + "'", double3 == 2.442666210788253d);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.6101172237222836d, (-3012.0898484574304d), (-1119.0111575101134d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.6949686296169904d) + "'", double3 == (-2.6949686296169904d));
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-60.536079301173494d), (-0.0022646656629954167d), 25.01838673699937d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.41957306327781d) + "'", double3 == (-2.41957306327781d));
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.06444874751764998d, (-19.08257435763428d), (-0.7898696145124717d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-24.240738918625162d) + "'", double3 == (-24.240738918625162d));
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.007528883973507984d, (-20037.97917199869d), (-22.862368511464002d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-876.4615394435142d) + "'", double3 == (-876.4615394435142d));
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-546.8637110016421d), (-8586.388369914019d), 9316.35136841457d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8629477722543778d + "'", double3 == 0.8629477722543778d);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(27.21311475409836d, (-3.5020705481508303d), 58.58234368006642d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5243078950544022d + "'", double3 == 0.5243078950544022d);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-15.4449034606291d), (-20491.383131969695d), 0.02369851381595228d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 864017.8193252782d + "'", double3 == 864017.8193252782d);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0d), (-4.4999183035714285d), 757.7856488949959d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.005938246930557758d + "'", double3 == 0.005938246930557758d);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.16449752507649265d), 0.30711943793911006d, (-143.84968058754487d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0032785402170468036d + "'", double3 == 0.0032785402170468036d);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0028718373568427723d), (-3144.743169398907d), 0.5243078950544022d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5997.88850639995d + "'", double3 == 5997.88850639995d);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(576.4304228548518d, (-0.17727103796640375d), (-0.047808065325613415d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-12060.887424865063d) + "'", double3 == (-12060.887424865063d));
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-206664.29901807886d), (-2.9279365079365083d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-70583.59990317124d) + "'", double3 == (-70583.59990317124d));
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.18932071331315758d, 46.34676267368015d, 17.071702602005715d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.7037398106351773d) + "'", double3 == (-2.7037398106351773d));
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-5.882378261446413d), 0.08632058739905799d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 68.14571631970391d + "'", double3 == 68.14571631970391d);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1987915654186478E-4d), (-137.481191005291d), 31.666666666666664d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.341507509246353d + "'", double3 == 4.341507509246353d);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.027936507936508d), (double) 1, (-0.005714285714285714d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 879.8888888888889d + "'", double3 == 879.8888888888889d);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-49.17055488661449d), (-60.536079301173494d), 599.7651782375282d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.018949957128151004d + "'", double3 == 0.018949957128151004d);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-28.21311475409836d), 0.0d, 498.5365853658536d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.056591864232780474d) + "'", double3 == (-0.056591864232780474d));
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-30022.485396605553d), 0.0d, (-161.92118226600988d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 185.41419335293355d + "'", double3 == 185.41419335293355d);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2309.7573905377603d, (-16719.06947781108d), (-4.6092955089565593E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.1283590586398613E8d) + "'", double3 == (-4.1283590586398613E8d));
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.15225896938846545d, (-0.1921715267680537d), (-0.5381431908648426d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.640035035290495d) + "'", double3 == (-0.640035035290495d));
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.1d), (-12060.887424865063d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1623.7107940945573d), 11.484264408496168d, 12.953457588734812d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-126.23618422351787d) + "'", double3 == (-126.23618422351787d));
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(526.749700119952d, 9.818018633727817d, (-4.1283590586398613E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.2521480669283976E-6d) + "'", double3 == (-1.2521480669283976E-6d));
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.34545264431260303d), 4.341507509246353d, (-165.75236969763668d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.028276881724881808d + "'", double3 == 0.028276881724881808d);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.4279878645578637E-5d), (-0.5282846310233278d), (-243.73163541018437d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0021673852483517562d) + "'", double3 == (-0.0021673852483517562d));
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-67.87558463488088d), 0.0d, 51.546592831758396d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.3167812052373329d) + "'", double3 == (-1.3167812052373329d));
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.588504832975711d), (-117.58846188300636d), 58.58234368006642d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.9118381070872112d + "'", double3 == 1.9118381070872112d);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-163.95336996416071d), 0.007528883973507984d, 0.007528883973507984d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-21777.583427379985d) + "'", double3 == (-21777.583427379985d));
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.019108774049942618d, 2.263231850117096d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(498.5365853658536d, 22.628457922462168d, 0.32571822743541134d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1461.1037619556068d + "'", double3 == 1461.1037619556068d);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.005159774436090226d, 58.58234368006642d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5857718390563034d) + "'", double3 == (-0.5857718390563034d));
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.0784191508581746d), (-2.9279365079365083d), (-0.5282846310233278d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.28485144954940284d + "'", double3 == 0.28485144954940284d);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9316.35136841457d, (-17.21311475409836d), (-0.09865590851564983d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-94607.25286096858d) + "'", double3 == (-94607.25286096858d));
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.005709848924953292d), (-0.025371718504164222d), (-44.64002291424865d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.4045384154440165E-4d) + "'", double3 == (-4.4045384154440165E-4d));
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(111.88477646529707d, 2181.9304462292166d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-207.00456697639197d) + "'", double3 == (-207.00456697639197d));
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.5d, (-19.08257435763428d), (-0.9714562908496731d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-23.24610440052088d) + "'", double3 == (-23.24610440052088d));
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.640035035290495d), (-24.240738918625162d), 2309.7573905377603d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.010217828062816556d + "'", double3 == 0.010217828062816556d);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-67.87558463488088d), 0.058149167826910875d, 0.906825088732021d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-74.91382257376331d) + "'", double3 == (-74.91382257376331d));
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10, (-17.783989825804095d), 0.01146206392065246d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2423.9953657685182d + "'", double3 == 2423.9953657685182d);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(179.4136678795534d, 0.35444509006391633d, (-0.047808065325613415d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3745.3768850495107d) + "'", double3 == (-3745.3768850495107d));
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.01534717083845554d), 576.4304228548518d, (-100.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.764457700256903d + "'", double3 == 5.764457700256903d);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.007179270658916316d, 526.749700119952d, (-0.5649782107488386d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 932.3236026237777d + "'", double3 == 932.3236026237777d);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.435269469819528d), 0.0d, (-1.0307216494845362d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.273266038932729d + "'", double3 == 5.273266038932729d);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.1608795582227505E-5d), (-3.7213114754098355d), (-0.037321193336271166d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-99.70956268961719d) + "'", double3 == (-99.70956268961719d));
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.007179270658916316d, 0.005159774436090226d, 169.02211401103276d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.1948118355058969E-5d + "'", double3 == 1.1948118355058969E-5d);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(16.723566459486438d, 57.539872235017945d, (-24925.365853658535d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0016375408896772724d + "'", double3 == 0.0016375408896772724d);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.1794108969975924E8d), 92.56364379175143d, (-53.178161845656376d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7859263.422388127d + "'", double3 == 7859263.422388127d);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0d), 42.21606629824469d, (-0.27451240016813794d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 153.7856441908908d + "'", double3 == 153.7856441908908d);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10, (-0.0021673852483517562d), (-4.85125159414909E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-20617.70491827632d) + "'", double3 == (-20617.70491827632d));
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3142124542124545d, 3.061156423001374d, 0.1d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-17.469439687889192d) + "'", double3 == (-17.469439687889192d));
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10L, (-0.5649782107488386d), 24.449669813176985d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4321112837709945d + "'", double3 == 0.4321112837709945d);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(100.0d, (-4.027936507936508d), (-2.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-52.01396825396825d) + "'", double3 == (-52.01396825396825d));
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(588.5635443720768d, 2.442666210788253d, 61.988755295184255d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.455277418787318d + "'", double3 == 9.455277418787318d);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3163.887346055446d, (-126.23618422351787d), 1.1948118355058969E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.753675041129709E8d + "'", double3 == 2.753675041129709E8d);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.051418511051468d), (double) (-1), 0.007528883973507984d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-139.65131017440473d) + "'", double3 == (-139.65131017440473d));
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(Double.NEGATIVE_INFINITY, 0.1d, 17.807841915085817d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8.81084214573422E-5d, (-1209.3780841486393d), (-56.98276689365725d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-21.223577551332923d) + "'", double3 == (-21.223577551332923d));
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(576.4304228548518d, (-139.65131017440473d), 58.58234368006642d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.223507767800605d + "'", double3 == 12.223507767800605d);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1046.6286357600898d, (-0.5282846310233278d), 0.0010462050201086822d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1000909.86017476d + "'", double3 == 1000909.86017476d);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (-1.0f), (-0.640035035290495d), 2392.665682152357d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.504451572129765E-4d) + "'", double3 == (-1.504451572129765E-4d));
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.616698045830711d, 0.03582877937328788d, (-0.9714562908496731d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.744848552657145d) + "'", double3 == (-5.744848552657145d));
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0452656794425087d, (-163.95336996416071d), (-0.09722222222222221d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1686.843109477062d) + "'", double3 == (-1686.843109477062d));
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.015973479995594054d), (-18.842339607366924d), (-94607.25286096858d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.9899495607422277E-4d) + "'", double3 == (-1.9899495607422277E-4d));
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.681947024916315d, (-1.3167812052373329d), (-2.263231850117096d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.859744364937509d) + "'", double3 == (-4.859744364937509d));
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.999836607142857d, (-5.744848552657145d), 0.23007705294454095d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 72.77859719385503d + "'", double3 == 72.77859719385503d);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) -1, 18.356021444943778d, 231.86379083762387d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.08348013881347674d) + "'", double3 == (-0.08348013881347674d));
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 2.8773142294897722d, 10.999836607142857d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.26157790631375005d) + "'", double3 == (-0.26157790631375005d));
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1.0f, 0.10594565495853255d, 0.14167505396309205d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.310598231883354d + "'", double3 == 6.310598231883354d);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.388109241365902d), (-4.1283590586398613E8d), (-3.1608795582227505E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.3060791968549404E13d) + "'", double3 == (-1.3060791968549404E13d));
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.28125d, 68.14571631970391d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-143.84968058754487d), (-161.92118226600988d), (-17.469439687889192d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.03446372644643d) + "'", double3 == (-1.03446372644643d));
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3142124542124545d, (-0.08576417320182057d), (-10069.896224516728d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.3902592402152212E-4d) + "'", double3 == (-1.3902592402152212E-4d));
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7859263.422388127d, (-20491.383131969695d), 84.45213259648938d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 93304.39105865342d + "'", double3 == 93304.39105865342d);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (double) 0, 0.28125d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.26157790631375005d), 0.8629477722543778d, (-345.6051642422499d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0032537872546947776d + "'", double3 == 0.0032537872546947776d);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.1d), (-0.07589133532553058d), (-15.4449034606291d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.06630722343360997d + "'", double3 == 0.06630722343360997d);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-631.7732991932455d), 0.33593526285222397d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1880.6400192383467d + "'", double3 == 1880.6400192383467d);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.6174981309146284d), (double) (byte) 1, 51.546592831758396d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.03137934133093799d) + "'", double3 == (-0.03137934133093799d));
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.135416666666667d, 0.007179270658916316d, 46.34676267368015d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04591987170694782d + "'", double3 == 0.04591987170694782d);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(68.14571631970391d, (double) 1.0f, 0.058149167826910875d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1154.7149998702048d + "'", double3 == 1154.7149998702048d);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-7116507.983360336d), 24375.32745104039d, (-18.87433095138013d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 378338.3543080885d + "'", double3 == 378338.3543080885d);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1000909.86017476d, (-206664.29901807886d), 0.18932071331315758d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6378457.687275752d + "'", double3 == 6378457.687275752d);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0038614812638467486d), 932.3236026237777d, (-0.0036682088025059554d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 254164.22954661612d + "'", double3 == 254164.22954661612d);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-19.64194884052652d), (-0.5857718390563034d), (-20617.70491827632d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.24262767218969E-4d + "'", double3 == 9.24262767218969E-4d);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) -1, (-9.449978071646475d), 0.005978609982788297d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1413.3683407971002d + "'", double3 == 1413.3683407971002d);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0d), (-0.08576417320182057d), 0.007528883973507984d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11.391352756079183d + "'", double3 == 11.391352756079183d);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(68.33333333333334d, (-0.004719704291657331d), 5.616698045830711d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.166944436037914d + "'", double3 == 12.166944436037914d);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.744848552657145d), 0.0d, (-2021.4566648401276d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.00284193505237051d + "'", double3 == 0.00284193505237051d);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1209.3780841486393d), (-161.92118226600988d), (-9.129567400301896d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 114.7323696682487d + "'", double3 == 114.7323696682487d);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.07430549635937711d, (-4.143897996357012d), (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.6451240016813788d, 0.005978609982788297d, (-17.21311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.09522654180344194d) + "'", double3 == (-0.09522654180344194d));
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10, 3.6101172237222836d, 231.86379083762387d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.027558778165378155d + "'", double3 == 0.027558778165378155d);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.27451240016813794d), 6.351409346550463d, 0.485062117001907d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-13.659944808043116d) + "'", double3 == (-13.659944808043116d));
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-49.17055488661449d), 21.27789925075722d, 105.48891863734055d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.6678280055136961d) + "'", double3 == (-0.6678280055136961d));
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-18.178161845656373d), 9.455277418787318d, (-82.75578795139855d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.33391548734539833d + "'", double3 == 0.33391548734539833d);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.5020705481508303d), 1.3142124542124545d, 2.2109533306969795d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.1783738876319942d) + "'", double3 == (-2.1783738876319942d));
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5434642561268097d), (-18.87433095138013d), 0.005938246930557758d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3086.91553409881d + "'", double3 == 3086.91553409881d);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1.0f, 5.616698045830711d, (-0.640035035290495d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.21319582721798d + "'", double3 == 7.21319582721798d);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-196.86320693956702d), (-1.02d), (-52.17277789640387d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.753743136477039d + "'", double3 == 3.753743136477039d);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(100.2164565887138d, 1413.3683407971002d, (-0.5381431908648426d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2440.153302131423d + "'", double3 == 2440.153302131423d);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-28.21311475409836d), 9.24262767218969E-4d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0022646656629954167d), (-17.469439687889192d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.6947368421052632d, (-201590.80145719493d), (-0.29758395464714504d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-677427.3042814778d) + "'", double3 == (-677427.3042814778d));
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.056591864232780474d), (-202.14142258157375d), 114.7323696682487d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.7613584666792286d + "'", double3 == 1.7613584666792286d);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(17.071702602005715d, (-3144.743169398907d), 2.135416666666667d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1480.6547693272564d + "'", double3 == 1480.6547693272564d);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.640035035290495d), 0.0d, 3.3839331854628965d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.18913938314149753d) + "'", double3 == (-0.18913938314149753d));
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-9520.705174543298d), 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 952.0705174543298d + "'", double3 == 952.0705174543298d);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1531.9635775952681d), 0.35444509006391633d, 58.58234368006642d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-26.15665278012303d) + "'", double3 == (-26.15665278012303d));
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1331396435040129d, 0.3580677144265516d, (-8.77644506608603d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.025628608078652092d + "'", double3 == 0.025628608078652092d);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.4071387060023755d), (-0.09722222222222221d), 17.807841915085817d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.07355840702238403d) + "'", double3 == (-0.07355840702238403d));
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.1783738876319942d), Double.POSITIVE_INFINITY, (-0.09865590851564983d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.0d, (-3.455366112240529d), (-0.5649782107488386d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-23.81572573286746d) + "'", double3 == (-23.81572573286746d));
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.1d), 2.135416666666667d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1331396435040129d, (-26406.993606320168d), 0.6947368421052632d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 38010.25819494771d + "'", double3 == 38010.25819494771d);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.1517885680153465E-6d, (-7.820594347784853d), 42.21606629824469d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1852516396085581d + "'", double3 == 0.1852516396085581d);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.00284193505237051d, 0.0d, (-0.018932635507964993d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.15010773598714786d) + "'", double3 == (-0.15010773598714786d));
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1413.3683407971002d, (-1.3060791968549404E13d), (-48.56521324652172d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.6893307157254575E11d) + "'", double3 == (-2.6893307157254575E11d));
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-21.223577551332923d), (-0.004400885011325602d), 0.15225896938846545d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-139.36240834642797d) + "'", double3 == (-139.36240834642797d));
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0424390243902439d), 0.005159774436090226d, 1.0173792530493562d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.046785698335864295d) + "'", double3 == (-0.046785698335864295d));
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.020697114400256043d, 0.1331396435040129d, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.11244252910375685d) + "'", double3 == (-0.11244252910375685d));
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.8932635507964994d), 0.06269659953161594d, (-0.018932635507964993d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 50.492714018919415d + "'", double3 == 50.492714018919415d);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-11560.515027955293d), (-32.16059602649007d), (-0.056591864232780474d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 203710.45534935882d + "'", double3 == 203710.45534935882d);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.753675041129709E8d, (-6.813865147198482d), (-9.449978071646475d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.9139486762730505E7d) + "'", double3 == (-2.9139486762730505E7d));
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 0, (double) '4', (-3.0931547619047617d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 16.811315308380642d + "'", double3 == 16.811315308380642d);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0032785402170468036d, (double) '#', (-10.491428571428573d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.3357441478551286d + "'", double3 == 3.3357441478551286d);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(16.811315308380642d, 0.06630722343360997d, (-19.08257435763428d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.8775025723008872d) + "'", double3 == (-0.8775025723008872d));
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(71.07327366592149d, 105.48891863734055d, 3.753743136477039d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.168353752547599d) + "'", double3 == (-9.168353752547599d));
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.3496190917066646d, (-0.0d), 61.988755295184255d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03790395662113255d + "'", double3 == 0.03790395662113255d);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(13.439970251589838d, 0.029268292682926824d, (-202.14142258157375d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.06634316602523686d) + "'", double3 == (-0.06634316602523686d));
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.0d, (-3.1899127808776044d), (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3189912780877604d + "'", double3 == 1.3189912780877604d);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.015973479995594054d), (double) ' ', 498.5365853658536d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0642199076653532d) + "'", double3 == (-0.0642199076653532d));
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.09028571428571429d, (-0.6678280055136961d), (-1.4071387060023755d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5387626085229231d) + "'", double3 == (-0.5387626085229231d));
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (-1L), 0.06269659953161594d, (-2.051418511051468d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5180301307639676d + "'", double3 == 0.5180301307639676d);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.1921715267680537d), (-0.16339285714285715d), (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.575547437284293d, 0.04591987170694782d, (-0.037321193336271166d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-94.57434905081192d) + "'", double3 == (-94.57434905081192d));
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(153.7856441908908d, 0.8242244722222174d, 14.444541589784027d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.58956553019663d + "'", double3 == 10.58956553019663d);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-30522.347387205173d), (-190.41098095896922d), 1480.6547693272564d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-20.48548860584678d) + "'", double3 == (-20.48548860584678d));
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(14.444541589784027d, 9.681947024916315d, 2181.9304462292166d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.002182743530206641d + "'", double3 == 0.002182743530206641d);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 1.7613584666792286d, 1.760854173120857d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.000286391437786d) + "'", double3 == (-1.000286391437786d));
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(13.439970251589838d, 231.86379083762387d, 526.749700119952d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.41466339807368535d) + "'", double3 == (-0.41466339807368535d));
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-171.92101887315275d), (-31559.786016838494d), (-0.0021673852483517562d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.4481903954008661E7d) + "'", double3 == (-1.4481903954008661E7d));
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2021.4566648401276d), 0.0d, 0.005978609982788297d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-338114.8244591401d) + "'", double3 == (-338114.8244591401d));
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.025697295243334962d, (-143.84968058754487d), 0.003084440682492978d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 46645.53242972464d + "'", double3 == 46645.53242972464d);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-9.990971428571429d), 6.733333333333334d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4838076379066476d + "'", double3 == 1.4838076379066476d);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-20.319684608805325d), 0.003084440682492978d, (-0.6678280055136961d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.431142272710556d + "'", double3 == 30.431142272710556d);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.26157790631375005d), (-0.012861186212075172d), 1.6451240016813788d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.1511841781212097d) + "'", double3 == (-0.1511841781212097d));
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.760854173120857d, (-0.19468186134852805d), 9.24262767218969E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2115.7793041403506d + "'", double3 == 2115.7793041403506d);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.07430549635937711d, 11.55316059649232d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(864017.8193252782d, (-153.29942073470883d), 0.0016339285714285715d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.28891613658762E8d + "'", double3 == 5.28891613658762E8d);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(Double.NEGATIVE_INFINITY, (-0.0028718373568427723d), (-0.0737847753545197d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(Double.NaN, 0.485062117001907d, 17.807841915085817d);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.4467164732553828E-4d), 57.539872235017945d, 2900.5607116403717d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.019837549573001118d) + "'", double3 == (-0.019837549573001118d));
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.056591864232780474d), 0.0036780564517846265d, (-4.1283590586398613E8d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4599001644111297E-10d + "'", double3 == 1.4599001644111297E-10d);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1852516396085581d, 7.21319582721798d, 51.546592831758396d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.1363415853798087d) + "'", double3 == (-0.1363415853798087d));
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8663.342809865328d), (-0.06634316602523686d), 30022.548093205085d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.28855900038211735d) + "'", double3 == (-0.28855900038211735d));
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-15.4449034606291d), 38010.25819494771d, (-1321.0332618716707d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 28.784818820180682d + "'", double3 == 28.784818820180682d);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(879.8888888888889d, (-36816.32715833758d), 1.6451240016813788d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 22913.90558322626d + "'", double3 == 22913.90558322626d);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.029268292682926824d, 0.5180301307639676d, (-16719.06947781108d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.9233794304743282E-5d + "'", double3 == 2.9233794304743282E-5d);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-75.0259680625998d), 0.08632058739905799d, (-78.77523939134471d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.953501242653814d + "'", double3 == 0.953501242653814d);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.01534717083845554d), 71.07327366592149d, 0.28125d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-252.75954075292424d) + "'", double3 == (-252.75954075292424d));
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5649782107488386d), (-3144.743169398907d), 0.0036780564517846265d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 854847.725260599d + "'", double3 == 854847.725260599d);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.03137934133093799d), (-0.640035035290495d), 2176.404460537546d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.7966111308613394E-4d + "'", double3 == 2.7966111308613394E-4d);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-202.14142258157375d), (-4.859744364937509d), (-1623.7107940945573d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.12150050300469178d + "'", double3 == 0.12150050300469178d);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.30711943793911006d, 0.20992462917425397d, 0.6913657118653453d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1405837852482137d + "'", double3 == 0.1405837852482137d);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-190.41098095896922d), 219.99473074203414d, (-105.35026781283747d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.895630454685881d + "'", double3 == 3.895630454685881d);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(16.811315308380642d, 0.03580972901448908d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1461.1037619556068d, (-0.15847193644261548d), (-1.4467164732553828E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0100543270955753E7d) + "'", double3 == (-1.0100543270955753E7d));
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.03582877937328788d, 10.285714285714286d, 21.27789925075722d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.4817151066253044d) + "'", double3 == (-0.4817151066253044d));
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.285714285714286d, 526.749700119952d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-51.64639858342376d) + "'", double3 == (-51.64639858342376d));
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (-1), (-9.449978071646475d), 0.005978609982788297d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1413.3683407971002d + "'", double3 == 1413.3683407971002d);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 100L, (-20491.383131969695d), (-1686.843109477062d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-12.207052935914845d) + "'", double3 == (-12.207052935914845d));
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(54.71206935067825d, (-0.18913938314149753d), 0.32571822743541134d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 168.5543027975198d + "'", double3 == 168.5543027975198d);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1331396435040129d, (-522.6451813821972d), 9.999836607142857d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.27868629896233d + "'", double3 == 52.27868629896233d);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.17727103796640375d), (-0.0737847753545197d), 24.449669813176985d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.004232624137775097d) + "'", double3 == (-0.004232624137775097d));
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.0d, (-3.1608795582227505E-5d), 219.99473074203414d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.009091270513841624d + "'", double3 == 0.009091270513841624d);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.818018633727817d, (-3.5020705481508303d), 34.16666666666667d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.38985626873791157d + "'", double3 == 0.38985626873791157d);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10.0f, (-2.41957306327781d), 6.351409346550463d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.9554042867703132d + "'", double3 == 1.9554042867703132d);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.4476190476190476d), (-0.03137934133093799d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-10069.896224516728d), 3.6346762673680155d, (-0.025371718504164222d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 397037.78437912045d + "'", double3 == 397037.78437912045d);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 100L, 0.0d, (-17.21311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.80952380952381d) + "'", double3 == (-5.80952380952381d));
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.29758395464714504d), 5.081212852733868d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.378796807381013d) + "'", double3 == (-5.378796807381013d));
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-82.75578795139855d), 0.6913657118653453d, (-2.263231850117096d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 36.87079326801912d + "'", double3 == 36.87079326801912d);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (-1.0f), (-11.60305703182941d), Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.049517001548323815d, (-3745.3768850495107d), (-19.08257435763428d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-196.27469186580916d) + "'", double3 == (-196.27469186580916d));
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1L, 5.764457700256903d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.047644577002569036d) + "'", double3 == (-0.047644577002569036d));
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-580.4713660041064d), (-1686.843109477062d), (-0.06634316602523686d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-16676.499024060642d) + "'", double3 == (-16676.499024060642d));
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.3189912780877604d, (-21.223577551332923d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.058149167826910875d, 1.1517885680153465E-6d, (-153.29942073470883d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.7931008323228093E-4d) + "'", double3 == (-3.7931008323228093E-4d));
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-400.2869205463187d), (-0.9714562908496731d), 0.1405837852482137d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2840.4091094178507d) + "'", double3 == (-2840.4091094178507d));
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.027558778165378155d, (double) 1L, 4.341507509246353d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.22398699524613494d) + "'", double3 == (-0.22398699524613494d));
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(11.391352756079183d, (-1.3902592402152212E-4d), (-50.17055488661449d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.2270553277265517d) + "'", double3 == (-0.2270553277265517d));
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-31559.786016838494d), (-0.047808065325613415d), (-143.84968058754487d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 219.3938706006814d + "'", double3 == 219.3938706006814d);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.7662607002774456d, (-4.465365853658536d), 42.21606629824469d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.12392501274221063d + "'", double3 == 0.12392501274221063d);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(30022.548093205085d, 21.27789925075722d, 0.20992462917425397d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 142914.48465082634d + "'", double3 == 142914.48465082634d);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.58956553019663d, (-717.351836035973d), 12.223507767800605d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 59.552578146489715d + "'", double3 == 59.552578146489715d);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-68.33333333333334d), (-0.29397590361445786d), 1.1948118355058969E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5694566.743298978d) + "'", double3 == (-5694566.743298978d));
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-522.6451813821972d), 27.21311475409836d, (-9.168353752547599d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 59.97350352930122d + "'", double3 == 59.97350352930122d);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.263231850117096d, (-0.5857718390563034d), (-0.025371718504164222d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-112.29052887000132d) + "'", double3 == (-112.29052887000132d));
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-75.0259680625998d), 59.552578146489715d, 961.3970359880889d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.13998227701084454d) + "'", double3 == (-0.13998227701084454d));
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.019837549573001118d), 3.895630454685881d, (-5.882378261446413d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.6656266955699158d + "'", double3 == 0.6656266955699158d);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9520.705174543298d), 2.263231850117096d, (-196.27469186580916d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 48.51857524710401d + "'", double3 == 48.51857524710401d);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.8629477722543778d, 59.97350352930122d, (-60.536079301173494d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9764516704652357d + "'", double3 == 0.9764516704652357d);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-75.0259680625998d), (-0.005129344935279409d), (-27.21311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.7567898564924915d + "'", double3 == 2.7567898564924915d);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.7613584666792286d, 0.009091270513841624d, 219.3938706006814d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.007986855746552222d + "'", double3 == 0.007986855746552222d);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-855.4205352124766d), 254164.22954661612d, (-855.4205352124766d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 298.12196409159696d + "'", double3 == 298.12196409159696d);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.6656266955699158d, 0.025628608078652092d, Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(18.82264957487597d, (-0.8775025723008872d), 8.81084214573422E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 223589.88869996622d + "'", double3 == 223589.88869996622d);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.6656266955699158d, 51.546592831758396d, (-0.02047435439772061d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2485.10722964984d + "'", double3 == 2485.10722964984d);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-126.23618422351787d), 5.228571428571429d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 131.4647556520893d + "'", double3 == 131.4647556520893d);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.85125159414909E-4d), 1.4599001644111297E-10d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.851253054049255E-6d) + "'", double3 == (-4.851253054049255E-6d));
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.4071387060023755d), 0.0d, 526.749700119952d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0026713611904894117d) + "'", double3 == (-0.0026713611904894117d));
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.07317714068437882d), 5604.062084800248d, 1.0173792530493562d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5508.403326629523d) + "'", double3 == (-5508.403326629523d));
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-24.240738918625162d), (-0.005709848924953292d), 1154.7149998702048d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.02098788798311647d) + "'", double3 == (-0.02098788798311647d));
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0022646656629954167d), (-0.019837549573001118d), 6.733333333333334d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.002609834244060252d + "'", double3 == 0.002609834244060252d);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.06630722343360997d, 2440.153302131423d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.717338430158957E-5d) + "'", double3 == (-2.717338430158957E-5d));
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(13.439970251589838d, 854847.725260599d, 0.4822630255857173d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1772547.842024869d) + "'", double3 == (-1772547.842024869d));
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(576.4304228548518d, (-18.842339607366924d), 0.005978609982788297d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 99567.08401717755d + "'", double3 == 99567.08401717755d);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0032537872546947776d, (-0.0d), 1.6507423041392261E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 19.71105512069283d + "'", double3 == 19.71105512069283d);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3163.887346055446d, 8.81084214573422E-5d, (-12.057538907475166d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-262.3990917404834d) + "'", double3 == (-262.3990917404834d));
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(16.811315308380642d, 3.5d, 498.5365853658536d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.026700779238923993d + "'", double3 == 0.026700779238923993d);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) -1, 0.15225896938846545d, (-1.1987915654186478E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9611.837475567056d + "'", double3 == 9611.837475567056d);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1046.6286357600898d, 0.4822630255857173d, (-0.025371718504164222d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-41232.77548435679d) + "'", double3 == (-41232.77548435679d));
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0028718373568427723d), (-21777.583427379985d), 0.027558778165378155d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 790223.0071615296d + "'", double3 == 790223.0071615296d);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-45.18814580866656d), 5.273266038932729d, (-8588.49800713237d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.005875464115575659d + "'", double3 == 0.005875464115575659d);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.442666210788253d, (-208058.98921401298d), 1.3189912780877604d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 157742.8413187583d + "'", double3 == 157742.8413187583d);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.5180301307639676d, 0.33593526285222397d, 2423.9953657685182d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.512178879682437E-5d + "'", double3 == 7.512178879682437E-5d);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.5020705481508303d), 1.7613584666792286d, (-24.240738918625162d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.21713154176112798d + "'", double3 == 0.21713154176112798d);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.609427320082126d), (double) 10.0f, (-0.0022646656629954167d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5126.331674374675d + "'", double3 == 5126.331674374675d);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-56446.19464108165d), (-2.7037398106351773d), 1.6507423041392261E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.4192793605482405E8d) + "'", double3 == (-3.4192793605482405E8d));
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.3580677144265516d, 0.5243078950544022d, (-0.0026713611904894117d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 62.23051424857837d + "'", double3 == 62.23051424857837d);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (double) 1L, 42.40967615841203d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.02357952454682086d) + "'", double3 == (-0.02357952454682086d));
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 0.0f, 6378457.687275752d, 0.28485144954940284d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.2392224780199032E7d) + "'", double3 == (-2.2392224780199032E7d));
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(38010.25819494771d, (-4.851253054049255E-6d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.228571428571429d, 576.4304228548518d, (-5.80952380952381d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 98.32163016354006d + "'", double3 == 98.32163016354006d);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-373.8995556680519d), (-202.14142258157375d), (-0.07317714068437882d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2347.155566344006d + "'", double3 == 2347.155566344006d);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.7966111308613394E-4d, (-3.4554251090460095d), 576.4304228548518d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.005995007607412941d + "'", double3 == 0.005995007607412941d);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(526.749700119952d, (-1686.843109477062d), 57.539872235017945d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 38.47058958622179d + "'", double3 == 38.47058958622179d);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.047808065325613415d), 11.484264408496168d, (-2.717338430158957E-5d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 424388.5246618761d + "'", double3 == 424388.5246618761d);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(59.97350352930122d, 50.492714018919415d, (-45.18814580866656d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.20980700448575385d) + "'", double3 == (-0.20980700448575385d));
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.03582877937328788d, (-0.5387626085229231d), (-0.8802773951276158d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.6527390014518221d) + "'", double3 == (-0.6527390014518221d));
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-105.35026781283747d), 0.1331396435040129d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 791.2764751368901d + "'", double3 == 791.2764751368901d);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.4310986388598355d), 0.06444874751764998d, (-1.609427320082126d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.9292419531570836d + "'", double3 == 0.9292419531570836d);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 100, 0.007179270658916316d, (-18.87433095138013d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.2978206743815415d) + "'", double3 == (-5.2978206743815415d));
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-74.91382257376331d), (-0.5649782107488386d), 0.03790395662113255d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1961.506159005122d) + "'", double3 == (-1961.506159005122d));
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5604.062084800248d, (-0.09865590851564983d), (-9.168353752547599d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-611.250491851009d) + "'", double3 == (-611.250491851009d));
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.03137934133093799d), 30.431142272710556d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.049517001548323815d, (double) 100, (-112.57965019863204d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.8878201595235209d + "'", double3 == 0.8878201595235209d);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (byte) 10, (-631.7732991932455d), 5.833577161170763E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.100136813934669E7d + "'", double3 == 1.100136813934669E7d);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.01146206392065246d, (-2.9279365079365083d), (-20.319684608805325d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.1446576867922154d) + "'", double3 == (-0.1446576867922154d));
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10L, (-0.2270553277265517d), (-20037.97917199869d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.103835691184848E-4d) + "'", double3 == (-5.103835691184848E-4d));
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0028718373568427723d), 0.01146206392065246d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-1.1987915654186478E-4d), (-23.24610440052088d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.15695681635064E-6d) + "'", double3 == (-5.15695681635064E-6d));
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.0d, (-1.02d), 157742.8413187583d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.9145084333160613E-5d + "'", double3 == 1.9145084333160613E-5d);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.009748709122203098d), 22913.90558322626d, 5297.471413713044d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.325443884910899d) + "'", double3 == (-4.325443884910899d));
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 100, (-4.4045384154440165E-4d), 59.552578146489715d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.67919582268725d + "'", double3 == 1.67919582268725d);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.005875464115575659d, (double) 10.0f, 2181.9304462292166d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.004580404729745688d) + "'", double3 == (-0.004580404729745688d));
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9520.705174543298d), (-165.75236969763668d), (-2.051418511051468d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4560.2361265867285d + "'", double3 == 4560.2361265867285d);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-196.27469186580916d), 0.0d, 0.906825088732021d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-216.4416206660676d) + "'", double3 == (-216.4416206660676d));
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(142914.48465082634d, (double) (-1.0f), 961.3970359880889d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 148.6539684449339d + "'", double3 == 148.6539684449339d);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.5180301307639676d, (-1.4310986388598355d), (-0.5857718390563034d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.327453864569369d) + "'", double3 == (-3.327453864569369d));
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.953501242653814d, (-3.455366112240529d), 9.961703135888502d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4425816845525891d + "'", double3 == 0.4425816845525891d);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-30022.485396605553d), 0.00284193505237051d, (-216.4416206660676d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 138.70940416242848d + "'", double3 == 138.70940416242848d);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-10069.896224516728d), (-5.588504832975711d), (-3.1899127808776044d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3155.041661331841d + "'", double3 == 3155.041661331841d);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.003084440682492978d, (-1606.2625826757928d), (-1.000286391437786d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1605.8057780908828d) + "'", double3 == (-1605.8057780908828d));
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(114.7323696682487d, 4244.555418052495d, (-0.025371718504164222d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 162772.69699750235d + "'", double3 == 162772.69699750235d);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3163.887346055446d, (-44.64002291424865d), (-611.250491851009d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.2491203062324345d) + "'", double3 == (-5.2491203062324345d));
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-23.538673630532d), 0.0d, 0.025628608078652092d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-918.453064571191d) + "'", double3 == (-918.453064571191d));
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-165.75236969763668d), 3163.887346055446d, 0.0452656794425087d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-73557.70987558049d) + "'", double3 == (-73557.70987558049d));
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5387626085229231d), 138.70940416242848d, (-4.85125159414909E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 287035.54962783895d + "'", double3 == 287035.54962783895d);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.003084440682492978d, 0.058149167826910875d, 0.8629477722543778d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.06381003452916503d) + "'", double3 == (-0.06381003452916503d));
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.717338430158957E-5d), (-13.659944808043116d), 3.061156423001374d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.462338981444688d + "'", double3 == 4.462338981444688d);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(132.93978337338487d, 142914.48465082634d, 46.34676267368015d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3080.7231536915333d) + "'", double3 == (-3080.7231536915333d));
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.24262767218969E-4d, (double) (-1L), (-17.469439687889192d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.05729572789109639d) + "'", double3 == (-0.05729572789109639d));
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.7662607002774456d, (-0.20980700448575385d), (-0.004400885011325602d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-221.78895886879707d) + "'", double3 == (-221.78895886879707d));
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-0.06381003452916503d), 0.8362499952866399d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.07630497445598548d + "'", double3 == 0.07630497445598548d);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-17.469439687889192d), (-0.9569215772565901d), 25.01838673699937d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.6600153033134007d) + "'", double3 == (-0.6600153033134007d));
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(100.0d, (-17.783989825804095d), (-0.18913938314149753d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-622.7364595859364d) + "'", double3 == (-622.7364595859364d));
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(20.85909840205065d, 0.12582570479630809d, 3.575547437284293d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.79862889834898d + "'", double3 == 5.79862889834898d);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.029268292682926824d, 0.003084440682492978d, (-0.1921715267680537d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.13625250546110876d) + "'", double3 == (-0.13625250546110876d));
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.138675582324624d, 157742.8413187583d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8.617483931146957E-4d), 2.138675582324624d, 2392.665682152357d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.94206552414413E-4d) + "'", double3 == (-8.94206552414413E-4d));
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(424388.5246618761d, 0.6656266955699158d, (-0.004400885011325602d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9.643238983591384E7d) + "'", double3 == (-9.643238983591384E7d));
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.717338430158957E-5d), 4.341507509246353d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.26157790631375005d), 5604.062084800248d, 0.1526315789473684d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-36717.982617732654d) + "'", double3 == (-36717.982617732654d));
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-94.57434905081192d), 1.4599001644111297E-10d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0d) + "'", double3 == (-0.0d));
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.02357952454682086d), 757.7856488949959d, 7.512178879682437E-5d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0087742059352795E7d) + "'", double3 == (-1.0087742059352795E7d));
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-11560.515027955293d), 12.953457588734812d, (-0.6527390014518221d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 17730.621978773015d + "'", double3 == 17730.621978773015d);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.58956553019663d, 0.0d, 9.990971428571429d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0599135034971061d + "'", double3 == 1.0599135034971061d);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10L, (-9227.722631526587d), (-201590.80145719493d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.04582412771193874d) + "'", double3 == (-0.04582412771193874d));
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.6092955089565593E-5d), (-0.004719704291657331d), (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.004673611336567765d) + "'", double3 == (-0.004673611336567765d));
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 10, 27.21311475409836d, 0.06269659953161594d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-274.5462255160796d) + "'", double3 == (-274.5462255160796d));
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(219.3938706006814d, (-0.015973479995594054d), 0.23007705294454095d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 953.6363634384901d + "'", double3 == 953.6363634384901d);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.029266685342399384d, (-1.000286391437786d), 58.58234368006642d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.017574460359640873d + "'", double3 == 0.017574460359640873d);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.263231850117096d), 1000909.86017476d, 1413.3683407971002d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-708.1749990537666d) + "'", double3 == (-708.1749990537666d));
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.29758395464714504d), 0.9292419531570836d, 0.017574460359640873d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-69.80731599711538d) + "'", double3 == (-69.80731599711538d));
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5126.331674374675d, 2.135416666666667d, 179.4136678795534d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 28.56079092674287d + "'", double3 == 28.56079092674287d);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.004673611336567765d), 12.953457588734812d, (-0.09522654180344194d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 136.07688523246375d + "'", double3 == 136.07688523246375d);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.00284193505237051d, 2485.10722964984d, (-100.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 24.851043877147877d + "'", double3 == 24.851043877147877d);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-78.77523939134471d), (double) (-1), (-0.004580404729745688d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 16979.992812919598d + "'", double3 == 16979.992812919598d);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3012.0898484574304d), (-5.80952380952381d), (-0.15847193644261548d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 18970.42714396637d + "'", double3 == 18970.42714396637d);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.4071387060023755d), 1000909.86017476d, (-2.151817791815755d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 465146.84984962095d + "'", double3 == 465146.84984962095d);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1291662100956973d, 59.97350352930122d, (-73557.70987558049d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.13569881667462E-4d + "'", double3 == 8.13569881667462E-4d);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3980.65074896532d), 16.723566459486438d, (-153.29942073470883d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 26.075599609358164d + "'", double3 == 26.075599609358164d);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.2978206743815415d), (-0.9d), (-855.4205352124766d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.005141121230260358d + "'", double3 == 0.005141121230260358d);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-0.005129344935279409d), (-0.19468186134852805d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.026347318130971787d) + "'", double3 == (-0.026347318130971787d));
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.004232624137775097d), (-0.34545264431260303d), (-9520.705174543298d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.583978433521822E-5d) + "'", double3 == (-3.583978433521822E-5d));
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-216.4416206660676d), 2176.404460537546d, 0.33593526285222397d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7122.93809493948d) + "'", double3 == (-7122.93809493948d));
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-100.0d), (-0.09865590851564983d), (-0.9569215772565901d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104.39867431758901d + "'", double3 == 104.39867431758901d);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.1948118355058969E-5d, 132.93978337338487d, (-1772547.842024869d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.499925715596078E-5d + "'", double3 == 7.499925715596078E-5d);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(8341.733699559149d, (-9.643238983591384E7d), (-0.08348013881347674d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1552536081078527E9d) + "'", double3 == (-1.1552536081078527E9d));
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.717338430158957E-5d), (-24925.365853658535d), 474.2632874824059d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.55596729571826d + "'", double3 == 52.55596729571826d);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.03446372644643d), 1.0173792530493562d, (-94.57434905081192d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02169555487390554d + "'", double3 == 0.02169555487390554d);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.005995007607412941d, (-139.65131017440473d), (-915.6322250395841d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.1525255461339563d) + "'", double3 == (-0.1525255461339563d));
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-855.4205352124766d), (-622.7364595859364d), 0.04160688665710186d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5592.441403851674d) + "'", double3 == (-5592.441403851674d));
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.07581370290688234d, (-44615.7642841512d), (-522.6451813821972d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-85.36544808441977d) + "'", double3 == (-85.36544808441977d));
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-53.178161845656376d), 219.3938706006814d, (-0.04799920498346337d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5678.678064360523d + "'", double3 == 5678.678064360523d);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(48.51857524710401d, 0.9292419531570836d, 0.33593526285222397d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 141.6622145882947d + "'", double3 == 141.6622145882947d);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-22.862368511464002d), 0.485062117001907d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.009091270513841624d, (-0.0038614812638467486d), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0012952751777688372d + "'", double3 == 0.0012952751777688372d);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5381431908648426d), 0.0d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-73557.70987558049d), 8341.733699559149d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.2491203062324345d), 4244.555418052495d, 57.539872235017945d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-73.85842848243861d) + "'", double3 == (-73.85842848243861d));
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.3060791968549404E13d), 21.27789925075722d, 0.0016339285714285715d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7.993490166556919E15d) + "'", double3 == (-7.993490166556919E15d));
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.7898696145124717d), (-1.504451572129765E-4d), 38.47058958622179d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.020527867595720343d) + "'", double3 == (-0.020527867595720343d));
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2485.10722964984d, 71.07327366592149d, 0.019230769230769232d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 125529.76571116375d + "'", double3 == 125529.76571116375d);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.8878201595235209d, 3.895630454685881d, (-196.86320693956702d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.015278681790882827d + "'", double3 == 0.015278681790882827d);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.23007705294454095d, (-5.2491203062324345d), 244.49669813176985d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.02241010778895672d + "'", double3 == 0.02241010778895672d);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(13.439970251589838d, (-0.0038614812638467486d), 9.961703135888502d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.34955153245034d + "'", double3 == 1.34955153245034d);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-30022.485396605553d), 0.03580972901448908d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 838389.069754146d + "'", double3 == 838389.069754146d);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.24262767218969E-4d, (-1.0307216494845362d), 0.0012952751777688372d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 796.468526501686d + "'", double3 == 796.468526501686d);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5857718390563034d), 588.5635443720768d, 0.005938246930557758d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-99212.66715592718d) + "'", double3 == (-99212.66715592718d));
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.046785698335864295d), (-0.06634316602523686d), (-3.5020705481508303d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.005584544177643519d) + "'", double3 == (-0.005584544177643519d));
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.435269469819528d), 0.1331396435040129d, 168.5543027975198d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.03303629169296696d) + "'", double3 == (-0.03303629169296696d));
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-9.129567400301896d), 0.0d, (-3745.3768850495107d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0024375564009978695d + "'", double3 == 0.0024375564009978695d);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(879.8888888888889d, 52.27868629896233d, 0.1405837852482137d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5886.953471402866d + "'", double3 == 5886.953471402866d);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1686.843109477062d), 465146.84984962095d, 397037.78437912045d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.1757916030312405d) + "'", double3 == (-1.1757916030312405d));
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(18.356021444943778d, 0.007179270658916316d, 2440.153302131423d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.007519544840997297d + "'", double3 == 0.007519544840997297d);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.4071387060023755d), 0.07630497445598548d, 0.058149167826910875d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-25.511004471706944d) + "'", double3 == (-25.511004471706944d));
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.5379425299724522d, 18.356021444943778d, 0.005938246930557758d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3000.5621395231774d) + "'", double3 == (-3000.5621395231774d));
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.027936507936508d), (-876.4615394435142d), (-24925.365853658535d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.03500183740763517d) + "'", double3 == (-0.03500183740763517d));
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.18913938314149753d), (-0.08348013881347674d), (-0.7371758664955071d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.14332976584043497d + "'", double3 == 0.14332976584043497d);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(12.166944436037914d, (-2.717338430158957E-5d), 1.100136813934669E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.1059507740593383E-6d + "'", double3 == 1.1059507740593383E-6d);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-677427.3042814778d), (-7122.93809493948d), (-5.378796807381013d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 124619.75980701079d + "'", double3 == 124619.75980701079d);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 1.6507423041392261E-4d, (-0.8802773951276158d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.8752524071118676E-4d + "'", double3 == 1.8752524071118676E-4d);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-258736.8504784611d), (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 258736.8504784611d + "'", double3 == 258736.8504784611d);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.14167505396309205d, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.0014167505396309205d) + "'", double3 == (-0.0014167505396309205d));
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(7859263.422388127d, (double) (-1), 93304.39105865342d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 84.232524677725d + "'", double3 == 84.232524677725d);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(599.7651782375282d, (-0.9d), 57.539872235017945d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.439112130526627d + "'", double3 == 10.439112130526627d);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(48.51857524710401d, (-208058.98921401298d), (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2081.075077892601d + "'", double3 == 2081.075077892601d);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5387626085229231d), (-5.103835691184848E-4d), 18.82264957487597d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.028595986065227025d) + "'", double3 == (-0.028595986065227025d));
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) 10, 0.028276881724881808d, (-0.0028718373568427723d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3472.2450749222744d) + "'", double3 == (-3472.2450749222744d));
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(17.071702602005715d, 1.1059507740593383E-6d, 0.1852516396085581d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 92.15411821524455d + "'", double3 == 92.15411821524455d);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.724968673526429E-4d, (-24925.365853658535d), (-216.4416206660676d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-115.1597666356924d) + "'", double3 == (-115.1597666356924d));
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.02369851381595228d, 38010.25819494771d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.234767913021508E-7d) + "'", double3 == (-6.234767913021508E-7d));
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(791.2764751368901d, 8.81084214573422E-5d, 9.681947024916315d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 81.72698993210076d + "'", double3 == 81.72698993210076d);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-45.18814580866656d), 0.1d, 223589.88869996622d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.0255006195489647E-4d) + "'", double3 == (-2.0255006195489647E-4d));
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(3.753743136477039d, 2.442666210788253d, 7859263.422388127d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.6681931311196593E-7d + "'", double3 == 1.6681931311196593E-7d);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-12060.887424865063d), (-20.251023116279637d), 168.5543027975198d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-71.4347613908908d) + "'", double3 == (-71.4347613908908d));
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(Double.NEGATIVE_INFINITY, (-15.4449034606291d), 0.4425816845525891d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(22.628457922462168d, (-345.6051642422499d), 141.6622145882947d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.599377845637171d + "'", double3 == 2.599377845637171d);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.1639100219545377d, (-0.0424390243902439d), (-0.02098788798311647d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-105.12487240829857d) + "'", double3 == (-105.12487240829857d));
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(961.3970359880889d, (-5.103835691184848E-4d), (-0.2721311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3532.8464053416346d) + "'", double3 == (-3532.8464053416346d));
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.07589133532553058d), (-0.09522654180344194d), (-16676.499024060642d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.159428393814239E-6d) + "'", double3 == (-1.159428393814239E-6d));
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.02357952454682086d), (-1.3902592402152212E-4d), 1480.6547693272564d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.5831170849805628E-5d) + "'", double3 == (-1.5831170849805628E-5d));
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(791.2764751368901d, (-16676.499024060642d), (-9227.722631526587d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.8929671162328545d) + "'", double3 == (-1.8929671162328545d));
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.056591864232780474d), 0.005445821671331467d, (-262.3990917404834d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.3642492621684885E-4d + "'", double3 == 2.3642492621684885E-4d);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(124619.75980701079d, (-208058.98921401298d), (-0.6527390014518221d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-509665.8055992972d) + "'", double3 == (-509665.8055992972d));
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.06630722343360997d, (-0.09722222222222221d), 0.01146206392065246d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 14.267015677794571d + "'", double3 == 14.267015677794571d);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.056591864232780474d), 3155.041661331841d, 2392.665682152357d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.3186540337544608d) + "'", double3 == (-1.3186540337544608d));
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.23007705294454095d, (-1.3186540337544608d), 2392.665682152357d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.472826932117897E-4d + "'", double3 == 6.472826932117897E-4d);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-52.17277789640387d), 4.462338981444688d, (-0.0642199076653532d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 881.893464764406d + "'", double3 == 881.893464764406d);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.33593526285222397d, (double) '4', 0.18932071331315758d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-272.891770969031d) + "'", double3 == (-272.891770969031d));
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(62.23051424857837d, (-0.02047435439772061d), 1.4599001644111297E-10d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.264057921254216E11d + "'", double3 == 4.264057921254216E11d);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.1d), 1461.1037619556068d, (-3012.0898484574304d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.4851129400087209d + "'", double3 == 0.4851129400087209d);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-73.85842848243861d), 0.18932071331315758d, (-139.36240834642797d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.5313323016898746d + "'", double3 == 0.5313323016898746d);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.588504832975711d), 1.7613584666792286d, 1.1059507740593383E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6645741.810621124d) + "'", double3 == (-6645741.810621124d));
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-70583.59990317124d), 599.7651782375282d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 117.68539165709558d + "'", double3 == 117.68539165709558d);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-71.4347613908908d), 0.0d, (-1.2521480669283976E-6d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.7049771730371326E7d + "'", double3 == 5.7049771730371326E7d);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.5649782107488386d), (-1.1552536081078527E9d), 791.2764751368901d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1459987.3038599016d + "'", double3 == 1459987.3038599016d);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(378338.3543080885d, (-580.4713660041064d), (-0.0642199076653532d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5900332.769841715d) + "'", double3 == (-5900332.769841715d));
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(68.33333333333334d, 0.01737925304935617d, (-0.5282846310233278d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-129.31656548090515d) + "'", double3 == (-129.31656548090515d));
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.018949957128151004d, 0.017574460359640873d, 6378457.687275752d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.1564723573444404E-10d + "'", double3 == 2.1564723573444404E-10d);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(12.223507767800605d, (-1.0d), (-0.13625250546110876d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.05148336942d) + "'", double3 == (-97.05148336942d));
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0424390243902439d), (-4.027936507936508d), 22.628457922462168d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.17612766619814846d + "'", double3 == 0.17612766619814846d);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.26157790631375005d), 0.0024375564009978695d, 6.310598231883354d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.041836835908971234d) + "'", double3 == (-0.041836835908971234d));
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.010217828062816556d, 1.4599001644111297E-10d, 0.20992462917425397d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04867379286088883d + "'", double3 == 0.04867379286088883d);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1321.0332618716707d), 0.38985626873791157d, (-30522.347387205173d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04329362684255219d + "'", double3 == 0.04329362684255219d);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.6893307157254575E11d), 0.003084440682492978d, 0.01146206392065246d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.3462883598823992E13d) + "'", double3 == (-2.3462883598823992E13d));
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.1525255461339563d), 0.049517001548323815d, (-6.357325234240991d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03178106204069363d + "'", double3 == 0.03178106204069363d);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-67.87558463488088d), 3.5d, 864017.8193252782d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.260892661984556E-5d) + "'", double3 == (-8.260892661984556E-5d));
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-58.13506877150787d), 2.7966111308613394E-4d, (-5.80952380952381d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.006904238401965d + "'", double3 == 10.006904238401965d);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.16339285714285715d), (-1961.506159005122d), (-3980.65074896532d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.492719128061608d) + "'", double3 == (-0.492719128061608d));
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.357325234240991d), (-243.73163541018437d), (-4.859744364937509d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-48.845019892110265d) + "'", double3 == (-48.845019892110265d));
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(81.72698993210076d, 7.21319582721798d, 0.0029268292682926825d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 25458.87965250162d + "'", double3 == 25458.87965250162d);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.08632058739905799d, 576.4304228548518d, 30022.548093205085d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.019197041519533612d) + "'", double3 == (-0.019197041519533612d));
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, 0.4822630255857173d, (-1.0087742059352795E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.7806835538443396E-8d + "'", double3 == 4.7806835538443396E-8d);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0642199076653532d), 5886.953471402866d, (-0.005129344935279409d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1147713.356304015d + "'", double3 == 1147713.356304015d);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0424390243902439d), 881.893464764406d, 0.0024375564009978695d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-361811.4860553608d) + "'", double3 == (-361811.4860553608d));
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.005714285714285714d), (-112.57965019863204d), 8341.733699559149d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.01349526848583852d + "'", double3 == 0.01349526848583852d);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) 100, 0.5243078950544022d, 0.002182743530206641d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 45573.696922390234d + "'", double3 == 45573.696922390234d);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0029268292682926825d, (-105.35026781283747d), (-0.04582412771193874d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2299.0769252473447d) + "'", double3 == (-2299.0769252473447d));
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.04456892170494916d, 61.988755295184255d, (-26406.993606320168d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0023457492850929374d + "'", double3 == 0.0023457492850929374d);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-855.4205352124766d), (-190.41098095896922d), (-5.2978206743815415d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 125.52511591592129d + "'", double3 == 125.52511591592129d);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-73.85842848243861d), (-12.207052935914845d), (-1623.7107940945573d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.03796943136102197d + "'", double3 == 0.03796943136102197d);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(254164.22954661612d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.33593526285222397d, (-677427.3042814778d), 0.0024375564009978695d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.779126012999823E8d + "'", double3 == 2.779126012999823E8d);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.28855900038211735d), (-3.1608795582227505E-5d), (-3.4554251090460095d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.083499824907562d + "'", double3 == 0.083499824907562d);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(10.439112130526627d, 796.468526501686d, 0.08632058739905799d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9105.932177423267d) + "'", double3 == (-9105.932177423267d));
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.6451240016813788d, 1.8752524071118676E-4d, (-0.41466339807368535d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.966919877862873d) + "'", double3 == (-3.966919877862873d));
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(153.7856441908908d, (-0.07317714068437882d), (-2.6893307157254575E11d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.721082216921438E-10d) + "'", double3 == (-5.721082216921438E-10d));
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.9701558956916101d), (-2.9279365079365083d), (-222.75294866864752d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.008789022205749395d) + "'", double3 == (-0.008789022205749395d));
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.8362499952866399d, (-139.36240834642797d), (-0.004400885011325602d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-31856.923773494596d) + "'", double3 == (-31856.923773494596d));
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) 1, 0.0016375408896772724d, 0.04591987170694782d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 21.7414034926249d + "'", double3 == 21.7414034926249d);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-509665.8055992972d), 105.48891863734055d, 854847.725260599d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.5963299421104871d) + "'", double3 == (-0.5963299421104871d));
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-44615.7642841512d), (-0.0020064545047003323d), 0.03580972901448908d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1245911.75374839d) + "'", double3 == (-1245911.75374839d));
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-112.57965019863204d), 0.0d, (-0.0642199076653532d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1753.0335108122406d + "'", double3 == 1753.0335108122406d);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.4838076379066476d, (-3.966919877862873d), 0.0016339285714285715d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3335.96438123599d + "'", double3 == 3335.96438123599d);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-5.378796807381013d), (-1.0985766771596108d), (-0.046785698335864295d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 91.485652292601d + "'", double3 == 91.485652292601d);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.17612766619814846d, (-9520.705174543298d), 132.93978337338487d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 71.61799922201182d + "'", double3 == 71.61799922201182d);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8588.49800713237d), 244.49669813176985d, (-5694566.743298978d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0015511267324521702d + "'", double3 == 0.0015511267324521702d);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.1526315789473684d, 125.52511591592129d, (-9.643238983591384E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.3001076147786403E-6d + "'", double3 == 1.3001076147786403E-6d);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.02047435439772061d), 1.7613584666792286d, 8595.796240032754d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.072911887764989E-4d) + "'", double3 == (-2.072911887764989E-4d));
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-28.21311475409836d), 10.0d, (-2.41957306327781d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.793329548119049d + "'", double3 == 15.793329548119049d);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-68.33333333333334d), 0.9764516704652357d, Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.04329362684255219d, (-190.41098095896922d), (-44615.7642841512d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.004268766379812227d) + "'", double3 == (-0.004268766379812227d));
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) 10, (-0.13625250546110876d), (-258736.8504784611d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.917591362311537E-5d) + "'", double3 == (-3.917591362311537E-5d));
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0024375564009978695d, 2440.153302131423d, 1.3001076147786403E-6d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.8768837570345962E9d) + "'", double3 == (-1.8768837570345962E9d));
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5.764457700256903d, (-4.859744364937509d), (-0.020527867595720343d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-517.550204162918d) + "'", double3 == (-517.550204162918d));
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(25458.87965250162d, 0.5313323016898746d, 34.16666666666667d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 745.12238985951d + "'", double3 == 745.12238985951d);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(6.351409346550463d, (-0.9569215772565901d), (-0.8802773951276158d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.30230443750921d) + "'", double3 == (-8.30230443750921d));
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-3.1608795582227505E-5d), (-5.2978206743815415d), 0.23007705294454095d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 23.026151447024002d + "'", double3 == 23.026151447024002d);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.7898696145124717d), 132.93978337338487d, (-112.57965019863204d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.1878670146154202d + "'", double3 == 1.1878670146154202d);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-1.4476190476190476d), 0.03790395662113255d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 38.191766154880995d + "'", double3 == 38.191766154880995d);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.135416666666667d, 0.6913657118653453d, 30.431142272710556d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.047453064425264424d + "'", double3 == 0.047453064425264424d);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.04329362684255219d, (-3144.743169398907d), 2440.153302131423d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.2887659395329154d + "'", double3 == 1.2887659395329154d);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(1.1948118355058969E-5d, 1.3189912780877604d, (-2.2392224780199032E7d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.8903451663085776E-8d + "'", double3 == 5.8903451663085776E-8d);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(22913.90558322626d, 0.029268292682926824d, (-0.09865590851564983d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-232260.55752452716d) + "'", double3 == (-232260.55752452716d));
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0737847753545197d), 21.7414034926249d, 0.8362499952866399d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-26.08692184267441d) + "'", double3 == (-26.08692184267441d));
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.02d), 0.0452656794425087d, (-36816.32715833758d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.89345994471712E-5d + "'", double3 == 2.89345994471712E-5d);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(104.39867431758901d, 117.68539165709558d, (-0.8775025723008872d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.14151383587133d + "'", double3 == 15.14151383587133d);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-509665.8055992972d), (-0.5387626085229231d), 10.028571428571428d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-50821.32290394331d) + "'", double3 == (-50821.32290394331d));
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.004719704291657331d), (-4.85125159414909E-4d), 26.075599609358164d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.6239623232758535E-4d) + "'", double3 == (-1.6239623232758535E-4d));
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.037321193336271166d), 0.0010462050201086822d, 9.818018633727817d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.003907855524390268d) + "'", double3 == (-0.003907855524390268d));
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0452656794425087d, (-0.007561380684840925d), 4836.99819182414d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0921455421803116E-5d + "'", double3 == 1.0921455421803116E-5d);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0d, (-1.0100543270955753E7d), (-161.92118226600988d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-62379.381928932686d) + "'", double3 == (-62379.381928932686d));
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2392.665682152357d, 100.2164565887138d, (-1.02d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2247.4992407486698d) + "'", double3 == (-2247.4992407486698d));
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.1639100219545377d, 7.512178879682437E-5d, 881.893464764406d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0024536239201452753d + "'", double3 == 0.0024536239201452753d);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(51.546592831758396d, 5.79862889834898d, 24375.32745104039d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0018768143330709101d + "'", double3 == 0.0018768143330709101d);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.027558778165378155d, (-137.481191005291d), 52.55596729571826d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.616425058066798d + "'", double3 == 2.616425058066798d);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0010462050201086822d, 0.4425816845525891d, 790223.0071615296d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-5.587479427085652E-7d) + "'", double3 == (-5.587479427085652E-7d));
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-677427.3042814778d), 2.2109533306969795d, (-23.81572573286746d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 28444.63036034656d + "'", double3 == 28444.63036034656d);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.0d, (-6.583223394584583d), (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.583223394584582d) + "'", double3 == (-8.583223394584582d));
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(9.452903627643943d, 68.33333333333334d, (-201590.80145719493d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.9207895042865763E-4d + "'", double3 == 2.9207895042865763E-4d);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0452656794425087d, 2485.10722964984d, (-56446.19464108165d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.04402532322633782d + "'", double3 == 0.04402532322633782d);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(169.02211401103276d, (-32.16059602649007d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.09137094436930399d), (-274.5462255160796d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.03178106204069363d, (-26406.993606320168d), (-105.35026781283747d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-250.65930951686082d) + "'", double3 == (-250.65930951686082d));
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1119.0111575101134d), (-0.8932635507964994d), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(12774.153009464499d, 0.6913657118653453d, (-0.015973479995594054d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-799666.800676867d) + "'", double3 == (-799666.800676867d));
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-18.178161845656373d), 0.0029255559974682515d, (-3532.8464053416346d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.00514629998467077d + "'", double3 == 0.00514629998467077d);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.025697295243334962d, 0.0d, 38010.25819494771d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 6.760621070116967E-7d + "'", double3 == 6.760621070116967E-7d);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.33391548734539833d, (-12060.887424865063d), 141.6622145882947d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 85.14070865971769d + "'", double3 == 85.14070865971769d);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-74.91382257376331d), (-9520.705174543298d), (-52.17277789640387d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-181.04827331075674d) + "'", double3 == (-181.04827331075674d));
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8.583223394584582d), 3.895630454685881d, 219.99473074203414d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.05672342154368765d) + "'", double3 == (-0.05672342154368765d));
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.05672342154368765d), 1.0d, 0.1291662100956973d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-8.1811134720201d) + "'", double3 == (-8.1811134720201d));
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.41466339807368535d), (-23.24610440052088d), (-0.02047435439772061d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1115.123854893759d) + "'", double3 == (-1115.123854893759d));
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.007519544840997297d, 5.7049771730371326E7d, 0.083499824907562d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-6.83232231756275E8d) + "'", double3 == (-6.83232231756275E8d));
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-73557.70987558049d), 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.NEGATIVE_INFINITY + "'", double3 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(71.61799922201182d, (-0.020527867595720343d), (-0.18913938314149753d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-378.760498737663d) + "'", double3 == (-378.760498737663d));
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(881.893464764406d, (-918.453064571191d), (-6.583223394584583d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-273.47492579646894d) + "'", double3 == (-273.47492579646894d));
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.03303629169296696d), 0.0017132848741286434d, 231.86379083762387d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.498706479418816E-4d) + "'", double3 == (-1.498706479418816E-4d));
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(881.893464764406d, (-97.05148336942d), (-196.86320693956702d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.97271665616187d) + "'", double3 == (-4.97271665616187d));
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) ' ', 2.135416666666667d, (-1.02d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-29.279003267973856d) + "'", double3 == (-29.279003267973856d));
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.005978609982788297d, 952.0705174543298d, (-6645741.810621124d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.4325933296457168E-4d + "'", double3 == 1.4325933296457168E-4d);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(4836.99819182414d, (-0.2857142857142857d), 1753.0335108122406d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.7593790285666446d + "'", double3 == 2.7593790285666446d);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-1.2521480669283976E-6d), 68.33333333333334d, (-0.07355840702238403d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 928.9670256818828d + "'", double3 == 928.9670256818828d);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.7567898564924915d, (-918.453064571191d), (-1119.0111575101134d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.8232356292831313d) + "'", double3 == (-0.8232356292831313d));
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.15010773598714786d), (-5592.441403851674d), (-99212.66715592718d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.05636670655498643d) + "'", double3 == (-0.05636670655498643d));
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) 1.0f, (-3.583978433521822E-5d), (-21777.583427379985d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4.5920422856791114E-5d) + "'", double3 == (-4.5920422856791114E-5d));
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(5126.331674374675d, 112.25635738831615d, (-27.21311475409836d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-184.25216526275173d) + "'", double3 == (-184.25216526275173d));
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-4.6092955089565593E-5d), (-49.17055488661449d), (-3.327453864569369d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-14.777217294347949d) + "'", double3 == (-14.777217294347949d));
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((double) (short) 1, (-11560.515027955293d), (-1.609427320082126d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-7183.620461572214d) + "'", double3 == (-7183.620461572214d));
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(99567.08401717755d, (-1.1d), 24375.32745104039d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.084793700399203d + "'", double3 == 4.084793700399203d);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(27.21311475409836d, 9.990971428571429d, (-8.94206552414413E-4d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-19259.69260572524d) + "'", double3 == (-19259.69260572524d));
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-117.58846188300636d), (-202.14142258157375d), (-24925.365853658535d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.003392245521890975d) + "'", double3 == (-0.003392245521890975d));
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(12.166944436037914d, (-14.777217294347949d), 2.9207895042865763E-4d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 92249.58419921181d + "'", double3 == 92249.58419921181d);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.0036780564517846265d, 117.68539165709558d, (-4.465365853658536d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 26.354327384894013d + "'", double3 == 26.354327384894013d);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-6.812158732714832E-5d), 2309.7573905377603d, 287035.54962783895d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.008046938651515831d) + "'", double3 == (-0.008046938651515831d));
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(0.30711943793911006d, 114.7323696682487d, 3335.96438123599d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.03430050119057761d) + "'", double3 == (-0.03430050119057761d));
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-0.0424390243902439d), (-52.01396825396825d), (-190.41098095896922d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.2729439708142521d) + "'", double3 == (-0.2729439708142521d));
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-8.94206552414413E-4d), 113.97243455562777d, (-717.351836035973d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.15888065386712802d + "'", double3 == 0.15888065386712802d);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-2.072911887764989E-4d), (-5.2978206743815415d), 2.779126012999823E8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.9062156082208216E-8d + "'", double3 == 1.9062156082208216E-8d);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(138.70940416242848d, 4560.2361265867285d, 0.953501242653814d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-4637.148358735402d) + "'", double3 == (-4637.148358735402d));
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        double double3 = com.thealgorithms.maths.StandardScore.zScore(2.3642492621684885E-4d, (-5.378796807381013d), (-112.57965019863204d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.04777980054847063d) + "'", double3 == (-0.04777980054847063d));
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        double double3 = com.thealgorithms.maths.StandardScore.zScore((-74.91382257376331d), (-2.1783738876319942d), 28.56079092674287d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-2.5466888810150405d) + "'", double3 == (-2.5466888810150405d));
    }
}

