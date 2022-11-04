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
        categories.add( new IssueCategory(1,"Take care") );
        categories.add( new IssueCategory(2,"Preventing") );
        categories.add( new IssueCategory(3,"Emergency preventions"));
        //categories.add( new IssueCategory(4,"Consequences") );
    }

    private void setIssues(){ //Sample Data => Will show on the last activity
        Issue i1 = new Issue();
        i1.category = categories.get(0);
        i1.description ="Ways to manage your sex health \nSafer sex practices often involve using barriers in your body to help prevent you and your partner from sharing bodily fluids\n";
        i1.title = "Practice Safe Sex";
        i1.RootCause= "";
        i1.Preventions.add(
                "Barrier methods include: " +
                        "\n\tCondoms, " +
                        "\n\tInternal condoms, " +
                        "\n\tDental condoms and gloves" +
                        "\n\nThese methods have been shown to be effective at preventing STIs, Which are transmitted through bodily fluids such as: " +
                        "\n\tSemen" +
                        "\n\tBlood" +
                        "\n\tVaginal Secretions" +
                        "\n\tSaliva" +
                        "\n\n\nBarrier methods can help protect you and your partner from such STIs wuch as:" +
                        "\n\tHIV" +
                        "\n\tGonorrhea" +
                        "\n\tTrichomoniasis" +
                        "\n\tHepatitis A, B, and C" +
                        "\n\nBarrier methods are less effective at preventing STIs that are transmitted through skin-to-skin contact,but they can still help reduce your risk" +
                        "\nExamples of STIs transmitted via skin-to-skin contact include:" +
                        "\n\tSyphilis" +
                        "\n\tHPV (Human Papilloma Virus)" +
                        "\n\tHSV (Human Simplex Virus)" +
                        "\nPubic lice can passed from one person to another through this method." +
                        "\nWhen Selecting barrier methods,opt for latex or polyurethane condoms and dental dams. And always use them during any kind of sexual contact or penetration to protect you and your partner." +
                        "\n\nUsing condoms, dental dams, and gloves can help reduce the transmission of STIs during:" +
                        "\n\n\tSyphilis" +
                        "\n\n\tHPV" +
                        "\n\n\tHerpes" +
                        "\n\n\tGonorrhea" +
                        "\n\n\tChlamydia"
        );
        i1.Symptoms.addAll(Arrays.asList(""));
        i1.EmergencyPreventions.addAll(Arrays.asList(""));

        Issue i2 = new Issue();
        i2.category = categories.get(0);
        i2.title = "Menstruation and Reproduction Health";
        i2.description =
                "Women often assume that pelvic pain, like cramping, is normal. They’ve been told that menstruation is supposed to hurt. Therefore, they may not discuss their discomfort with their doctor." +
                "\nWomen often assume that pelvic pain, like cramping, is normal. They’ve been told that menstruation is supposed to hurt. Therefore, they may not discuss their discomfort with their doctor." +
                "\n\nEndometriosis" +
                "\nEndometriosis is a painful condition in which tissue similar to the lining of the uterus grows outside the uterus." +
                "\nThe uterus lining is called the endometrium. It’s the source of blood and tissue during menstruation. It’s also needed to nourish a growing fetus." +
                "\nWhen you have endometriosis, endometrium-like tissue deposits onto organs and tissues throughout the abdomen and pelvis. This can be extremely painful." +
                "\n\n\n" +
                "Birth control\n" +
                "If you’re someone with a uterus having sex with someone who has sperm, it’s important to know your options for birth control.\n" +
                "\n" +
                "This can help empower you and your partner to be able to better manage your family planning decisions related to timing and the size of your family.\n" +
                "\n" +
                "There are a wide variety of available birth control options. Some methods require a prescription or a minor procedure in the doctor’s office, and some do not.\n" +
                "\n" +
                "Birth control options are usually affordable, regardless of your insurance status." +
                "\n\n" +
                "Contraceptive options include;" +
                "\tMale or female condom\n" +
                "\tIUD\n" +
                "\tBirth control pills\n" +
                "\tHormonal patches or rings\n" +
                "\tBirth control shot\n" +
                "\tUnder-the-skin implant\n" +
                "\tSterilization\n" +
                "\tContraceptive sponge\n" +
                "\tCervical cap\n" +
                "\tDiaphragm\n\n" +
                "Talk with your doctor about which of these options is right for you. Their effectiveness varies greatly and so does the ease of use. Sterilization is considered the most effective method, but it’s permanent.";
        i2.Preventions.addAll( Arrays.asList("If treatment for your fibroids becomes necessary, several options are available. Your doctor can help you decide which method is best for you.") );
        i2.RootCause = "";
        i2.EmergencyPreventions.addAll( Arrays.asList("If treatment for your fibroids becomes necessary, several options are available. Your doctor can help you decide which method is best for you.") );
        i2.Symptoms.addAll( Arrays.asList(
                "Symptoms for Endometriosis:\n" +
                        "\tSevere menstrual pain\n" +
                        "\tPain during sex\n" +
                        "\tPain during bowel movements\n" +
                        "\tHeavy bleeding\n" +
                        "\tBleeding between periods\n\n" +
                "Symptoms for Fibroid may include:\n" +
                        "\tpelvic pain\n" +
                        "\tpain during sex\n" +
                        "\theavy or painful menstrual bleeding\n" +
                        "\tfertility issues\n\n"
        ) );

        Issue i3 = new Issue();
        i3.category = categories.get(0);
        i3.title = "Lack of interest in sex";
        i3.description = "There are many reasons why someone may have a reduced interest in sex. Possible causes for decreased libido in women include:\n" +
                "\n" +
                "new medication\n" +
                "chronic medical conditions\n" +
                "fatigue\n" +
                "menopause\n" +
                "pregnancy, after delivery period, and breastfeeding\n" +
                "anxiety or depression\n" +
                "stress\n" +
                "relationship concerns";
        i3.Symptoms.addAll( Arrays.asList("Reduced interest in sex") );
        i3.Preventions.addAll( Arrays.asList("If you’ve experienced a sudden lack of interest in sex, talk with your doctor. There may be an identifiable cause.\n" +
                "\n" +
                "Your doctor can help you create a treatment plan for many of these conditions. They can also make a referral to a sex therapist or other therapist for counseling.\n" +
                "\n" +
                "Couples therapy may be beneficial, too. If you’re bothered by a decreased sex drive, there are a variety of methods and treatments that can help.") );
        i3.EmergencyPreventions.addAll(Arrays.asList(""));

        Issue i4 = new Issue();
        i4.category = categories.get(0);
        i4.title = "Painful sex";
        i4.description = "Sexual intercourse should not be painful. If you’re having pain during sex, talk with your doctor";
        i4.RootCause = "There are several potential causes of sexual pain. These include:\n" +
                "\n" +
                "infection\n" +
                "endometriosis\n" +
                "fibroids\n" +
                "vaginismus\n" +
                "vulvodynia\n" +
                "vaginal dryness\n" +
                "past negative sexual experiences";
        i4.EmergencyPreventions.addAll( Arrays.asList("Painful sex can be treated in a variety of ways, depending on the cause. When you talk with your doctor about your problem, be prepared to discuss if you have vaginal discharge or other vaginal issues, or pain that occurs:\n" +
                "\n" +
                "during penetration\n" +
                "when touched on the outside of your vulva\n" +
                "after sex\n" +
                "during deep penetration\n" +
                "The details are important. They can help your doctor diagnose underlying problems that may be causing your pain."));
        i4.Symptoms.addAll( Arrays.asList("If you’ve experienced a sudden lack of interest in sex, talk with your doctor. There may be an identifiable cause"));
        i4.Preventions.addAll( Arrays.asList("Couples therapy"));

        Issue i5 = new Issue();
        i5.category = categories.get(0);
        i5.title = "Problems with orgasm";
        i5.description = "There’s a common misconception that all women should be able to orgasm from vaginal intercourse. However, many women need direct clitoral stimulation to climax.\n" +
                "\n" +
                "If you have difficulty reaching orgasm, practice on your own to see what feels good for you. During a shower or bath is a good time for self-exploration.";
        i5.RootCause = "infection,endometriosis,fibroids,vaginismus,vulvodynia,past negative sexual experiences,";
        i5.EmergencyPreventions.addAll( Arrays.asList(""));
        i5.Symptoms.addAll( Arrays.asList("during penetration","when touched on the outside of your vulva","after sex","during deep penetration"));
        i5.Preventions.addAll( Arrays.asList("According to the American College of Obstetricians and Gynecologists, you might also try the following techniques alone or with a partner:\n" +
                "\n" +
                "Read books about sex and pleasure.\n" +
                "Learn about your body and how it works.\n" +
                "Explore varieties of sexual activity, such as oral sex, touching, and masturbation with and without a partner.\n" +
                "Try sensual nonsexual activities such as massage.\n" +
                "Talk with your partner about what you and they like.\n" +
                "Reduce sources of stress in your life.\n" +
                "Increase sexual stimulation.\n" +
                "Try sexual toys.\n" +
                "Use mental imagery and fantasy.\n" +
                "It’s also important to keep communication open between you and your sexual partner. For a better understanding of your sexual health, a sex therapist can be a helpful resource."));

        Issue i6 = new Issue();
        i6.category = categories.get(1);
        i6.title = "Prevent HIV with PrEP";
        i6.description = "PrEP, or pre-exposure prophylaxis, is a prescription medication that’s designed to help prevent contracting HIV during sex without a barrier method or when sharing needles. It’s taken before possible HIV exposure.\n" +
                "\n" +
                "The most common PrEP pills are available under the brand names Truvada and Descovy.";
        i6.RootCause = "";
        i6.EmergencyPreventions.addAll( Arrays.asList(""));
        i6.Symptoms.addAll( Arrays.asList("PrEP has side effects, but they usually go away over time. They can include:\n" +
                "\n" +
                "headache\n" +
                "diarrhea\n" +
                "nausea\n" +
                "fatigue\n" +
                "stomach pain"));
        i6.Preventions.addAll( Arrays.asList("Talk with your doctor about whether PrEP may be a good option for you, especially if:\n" +
                "\n" +
                "you plan to have sex without a condom with a partner who has HIV or another STI\n" +
                "you or your sexual partner share needles\n" +
                "your sexual partner generally does not use barrier methods during sex with you or other partners\n" +
                "your sexual partner is a penis owner and has sex with other penis owners"));

        Issue i7 = new Issue();
        i7.category = categories.get(1);
        i7.title = "Preventive vaccines";
        i7.description = "Currently, there are three STI vaccines available:\n" +
                "\n" +
                "HPV\n" +
                "hepatitis B\n" +
                "hepatitis A" +
                "\n\n" +
                "The hepatitis B vaccine is normally given during infancy. Hepatitis B causes liver disease. It can be transmitted through sexual activity without a barrier method as well as through blood or blood products.\n" +
                "\n" +
                "Hepatitis A is not usually passed from person to person during sex, but it can be transmitted during oral-anal contact. The hepatitis A vaccine is recommended for all children ages 1 year and older.";
        i7.RootCause = "";
        i7.EmergencyPreventions.addAll( Arrays.asList(""));
        i7.Symptoms.addAll( Arrays.asList(""));
        i7.Preventions.addAll( Arrays.asList("The three current HPV vaccines approved by the Food and Drug Administration (FDA) are:\n" +
                "\n" +
                "Cervarix protects against the two strains of HPV that cause most cases of cervical cancer.\n" +
                "Gardasil protects against those two strains, as well as the two strains that cause the majority of genital warts.\n" +
                "Gardasil 9 covers the same four HPV strains as Gardasil but includes an additional five “high risk” strains, which is nine strains in total.\n" +
                "These vaccines are most effective when given before having sex. It’s typically recommended beginning vaccinations for young women and men at age 11 years old. You can still get vaccinated through your late 20s."));

        Issue i8 = new Issue();
        i8.category = categories.get(1);
        i8.title = "Get screened for STIs";
        i8.description = "Screening can help reduce the risk of contracting an STI. Regular STI testing can help reduce the long-term effects of an infection.\n" +
                "\n" +
                "Left untreated, bacterial STIs such as gonorrhea and chlamydia can have serious negative effects on your health, including infertility. Screening can help prevent these complications.\n" +
                "\n" +
                "Make a date with a new partner to get tested before starting a sexual relationship. That way, you’ll each know if you’re putting each other at risk, and treatment can be given if appropriate.\n" +
                "\n" +
                "STI screening is recommended for anyone who’s sexually active. STIs can affect individuals of any age or relationship status.";
        i8.RootCause = "";
        i8.EmergencyPreventions.addAll( Arrays.asList(""));
        i8.Symptoms.addAll( Arrays.asList(""));
        i8.Preventions.addAll( Arrays.asList(""));

        Issue i9 = new Issue();
        i9.category = categories.get(1);
        i9.title = "Get regular Pap smears";
        i9.description = "Pap smears are a routine part of women’s healthcare to check for cervical cancer and are recommended starting at age 21 years.\n" +
                "\n" +
                "This test detects early signs of cervical changes that could lead to cervical cancer if left untreated. Precancerous changes can be followed up and treated before they become serious.";
        i9.RootCause = "";
        i9.EmergencyPreventions.addAll( Arrays.asList(""));
        i9.Symptoms.addAll( Arrays.asList(""));
        i9.Preventions.addAll( Arrays.asList(""));

        Issue i10 = new Issue();
        i10.category = categories.get(2);
        i10.title = "Emergency contraception";
        i10.description = "Emergency contraception is a method of birth control you can use if you had sex without using birth control or if your birth control method did not work correctly. You must use emergency contraception as soon as possible after unprotected sex.\n" +
                "\n" +
                "Emergency contraception pills are different from the abortion pill. If you are already pregnant, emergency contraception pills do not stop or harm your pregnancy.\n" +
                "\n" +
                "Emergency contraception has also been called the \"morning-after pill,\" but you do not need to wait until the morning after unprotected sex to take it.\n" +
                "\n" +
                "Emergency contraception is not meant to be used for regular birth control. Talk to your doctor or nurse about regular birth control to help prevent pregnancy. Nearly half of all pregnancies in the United States are unplanned." +
                "\n\n" +
                "How do emergency contraception pills prevent pregnancy?" +
                "\n\t" +
                "Research shows that emergency contraception pills work mostly by preventing or delaying ovulation (the release of an egg from the ovary). Less commonly, emergency contraception may prevent fertilization of the egg by the sperm if ovulation has already happened. If a fertilized egg has already implanted in your uterus (you are pregnant), emergency contraception pills will not stop or harm your pregnancy." +
                "";
        i10.RootCause = "";
        i10.EmergencyPreventions.addAll( Arrays.asList("How quickly should I use emergency contraception after unprotected sex?" +
                "\n\n" +
                "Emergency contraception works best when you use it as soon as possible after unprotected sex. If you are unable to take it right away, emergency contraception can still work to prevent pregnancy if taken up to three to five days after unprotected sex. How long after depends on which type of emergency contraception you use.\n" +
                "\n" +
                "Take Plan B One-Step® or a generic version as soon as possible within three days (or 72 hours) after unprotected sex.\n" +
                "For the two-dose version (Next Choice®, LNG tablets 0.75 mg), take one pill as soon as possible within 3 days and the second pill 12 hours later.\n" +
                "Take ella® (ulipristal acetate) as soon as possible within five days (or 120 hours) after unprotected sex."));
        i10.Symptoms.addAll( Arrays.asList("The side effects are rarely serious. Side effects differ for each woman and may include:\n" +
                "\n" +
                "Headache\n" +
                "Abdominal pain\n" +
                "Tiredness (fatigue)\n" +
                "Dizziness\n" +
                "Nausea\n" +
                "Breast pain\n" +
                "The side effects are usually mild and do not last long. Your next period may come early or late, and you may have spotting (light bleeding that happens between menstrual periods)."));
        i10.Preventions.addAll( Arrays.asList("What Emergency Contraceptive are available to you.\n" +
                "\n" +
                "Plan B One-Step® and similar generic versions are available in stores without a prescription to anyone, of any age. If you do not see it on the shelf, ask the pharmacist for help.\n" +
                "Levonorgestrel tablets (two-pill generic Next Choice® and LNG tablets 0.75 mg) are available to people aged 17 and older without a prescription. These brands are sold from behind the pharmacy counter.\n" +
                "ella® is available only by prescription from your doctor, nurse, or family planning clinic."));

        this.issues.add(i1);
        this.issues.add(i2);
        this.issues.add(i3);
        this.issues.add(i4);
        this.issues.add(i5);
        this.issues.add(i6);
        this.issues.add(i7);
        this.issues.add(i8);
        this.issues.add(i9);
        this.issues.add(i10);
//Site: https://www.womenshealth.gov/a-z-topics/emergency-contraception
//    : https://www.healthline.com/health/womens-health-sex
    }

}
