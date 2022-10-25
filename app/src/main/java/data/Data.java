package data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import models.Issue;
import models.IssueCategory;

public final class Data {
    public ArrayList<Issue> issues = new ArrayList<Issue>();
    public ArrayList<IssueCategory> categories = new ArrayList<IssueCategory>();

    public Data (){
        this.setIssueCategories();
        this.setIssues();
    }

    private void setIssueCategories(){
        categories.add( new IssueCategory(1,"Menstruation and reproductive health") );
        categories.add( new IssueCategory(2,"Sexual relationships and libido") );
    }

    private void setIssues(){
        Issue i1 = new Issue();
        i1.category = categories.get(0);
        i1.description ="Endometriosis is a painful condition in which tissue similar to the lining of the uterus grows outside the uterus.The uterus lining is called the endometrium. It’s the source of blood and tissue during menstruation. It’s also needed to nourish a growing fetus.";
        i1.title = "Endometriosis";
        i1.RootCause= "";
        i1.Preventions.add(".");
        i1.Symptoms.addAll(Arrays.asList("severe menstrual pain","pain during sex","pain during bowel movements","heavy bleeding","bleeding between periods"));
        i1.EmergencyPreventions.addAll(Arrays.asList("hormone therapy","anti-inflammatory medications","surgery to remove the excess tissue","hysterectomy (removal of the uterus)"));

        Issue i2 = new Issue();
        i2.category = categories.get(0);
        i2.description ="Fibroids are noncancerous tumors in the uterus. Research shows that up to 77 percentTrusted Source of women have fibroids, according to a review published in 2016. However, most women will never need treatment";
        i2.Preventions.addAll( Arrays.asList(".") );
        i2.RootCause = "";
        i2.EmergencyPreventions.addAll( Arrays.asList("If treatment for your fibroids becomes necessary, several options are available. Your doctor can help you decide which method is best for you.") );
        i2.Symptoms.addAll( Arrays.asList("pelvic pain","pain during sex","heavy or painful menstrual bleeding","fertility issues") );

        Issue i3 = new Issue();
        i3.category = categories.get(0);
        i3.title = "Birth control";
        i3.description = "If you’re someone with a uterus having sex with someone who has sperm, it’s important to know your options for birth control.";
        i3.Symptoms.addAll( Arrays.asList("") );
        i3.Preventions.addAll( Arrays.asList("male or female condom","IUD","birth control pills","hormonal patches or rings","birth control shot","contraceptive sponge") );
        i3.EmergencyPreventions.addAll(Arrays.asList("sterilization","diaphragm","cervical cap"));

        Issue i4 = new Issue();
        i4.category = categories.get(1);
        i4.title = "Lack of interest in sex";
        i4.description = "There are many reasons why someone may have a reduced interest in sex";
        i4.RootCause = "new medication,chronic medical conditions,fatigue,menopause,pregnancy, after delivery period, and breastfeeding,anxiety or depression,stress,relationship concerns.";
        i4.EmergencyPreventions.addAll( Arrays.asList(""));
        i4.Symptoms.addAll( Arrays.asList("If you’ve experienced a sudden lack of interest in sex, talk with your doctor. There may be an identifiable cause"));
        i4.Preventions.addAll( Arrays.asList("Couples therapy"));

        Issue i5 = new Issue();
        i5.category = categories.get(1);
        i5.title = "Painful sex";
        i5.description = "Sexual intercourse shouldn’t be painful. If you’re having pain during sex, talk with your doctor. There are several potential causes of sexual pain";
        i5.RootCause = "infection,endometriosis,fibroids,vaginismus,vulvodynia,past negative sexual experiences,";
        i5.EmergencyPreventions.addAll( Arrays.asList(""));
        i5.Symptoms.addAll( Arrays.asList("during penetration","when touched on the outside of your vulva","after sex","during deep penetration"));
        i5.Preventions.addAll( Arrays.asList(""));

        Issue i6 = new Issue();
        i6.category = categories.get(1);
        i6.title = "Problems with orgasm";
        i6.description = "There’s a common misconception that all women should be able to orgasm from vaginal intercourse. However, many women need direct clitoral stimulation to climax.";
        i6.RootCause = "";
        i6.EmergencyPreventions.addAll( Arrays.asList(""));
        i6.Symptoms.addAll( Arrays.asList(""));
        i6.Preventions.addAll( Arrays.asList("Read books about sex and pleasure.","Learn about your body and how it works.","Try sensual nonsexual activities such as massage.","Reduce sources of stress in your life.","Try sexual toys."));

        this.issues.add(i1);
        this.issues.add(i2);
        this.issues.add(i3);
        this.issues.add(i4);
        this.issues.add(i5);
        this.issues.add(i6);

    }

}
