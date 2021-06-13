
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import java.util.ArrayList;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Font;

public class INGNepal{
    
    ArrayList<StaffHire> staffList = new ArrayList<StaffHire>();//creating array list
    
    private JFrame f;
    private JPanel pnlMain, pnlFullTime, pnlPartTime;
    private JMenuBar mBar;
    private JMenu mFile, mAbout;
    private JMenuItem mItemNew, mItemExit, mItemVersion, mItemDeveloper;
    private JButton fbtnBack, fbtnAdd, fbtnAppoint, fbtnDisplay, fbtnClear, fbtnPartTime, pbtnBack, pbtnAdd, pbtnAppoint, pbtnDisplay, 
            pbtnClear, pbtnTerminate, pbtnFullTime;
    private JTextField tVacNo, tDesig, tJobType, tSalary, tWorkHr, tStaff,tDate, tQuali, tAppoint, tpVacNo, tpDesig, tpJobType, tpWorkShift, 
            tpWperHr, tpWorkHr, tpStaff, tpDate, tpQuali, tpAppoint;
    
    public INGNepal(){
        initializeFrame();
        initializeMenu();
        initMainPanel();
        initPanelFullTime();
        initPanelPartTime();
        
    }
    
    public void initializeFrame(){
        f = new JFrame("INGNepal");
        f.setSize(650, 530);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setResizable(false);
    }
    
    public void initializeMenu(){
        //initialization of MenuBar
        mBar = new JMenuBar();
        f.setJMenuBar(mBar);
        
        //initalization of Menu
        mFile = new JMenu("File");
        mBar.add(mFile);
        mAbout = new JMenu("About");
        mBar.add(mAbout);
        
        //initialization of MenuItem
        mItemNew = new JMenuItem("New");
        mItemNew.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                pnlMain.setVisible(true);
                pnlFullTime.setVisible(false);
                pnlPartTime.setVisible(false);
                fullTimeClear();
                partTimeClear();
            }
        });
        mFile.add(mItemNew);
        
        mItemExit = new JMenuItem("Exit");
        mItemExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });
        mFile.add(mItemExit);
        
        mItemVersion = new JMenuItem("Version");
        mItemVersion.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                JOptionPane.showMessageDialog(f,"Version 1.1.1", "Version", 1);
            }
        });
        mAbout.add(mItemVersion);
        
        mItemDeveloper = new JMenuItem("Developer");
        mItemDeveloper.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                JOptionPane.showMessageDialog(f, "This is developed and designed by Manoj Rai of L1C3"+ 
                "\n College ID: NP05CP4A190082"+"\n London Met ID: 19031757", "Info", (1));   
            }
        });
        mAbout.add(mItemDeveloper);
    }
    
    public void initMainPanel(){
        //initialization of main panel
        pnlMain = new JPanel();
        pnlMain.setBounds(0, 0, 650, 530); //(x-axis, y-axis, length, breadth)
        pnlMain.setLayout(null);
        
        //initialization of JLable
        JLabel mainlbl = new JLabel("Main Frame");
        mainlbl.setBounds(260, 30, 150, 25);//(x-axis, y-axis, length, breadth)
        Font fnt = mainlbl.getFont();
        mainlbl.setFont(new Font("Arial",Font.BOLD,20));
        pnlMain.add(mainlbl);
        
        JLabel lbldes = new JLabel("This is the home panel of StaffHire.");
        Font fnt2 = lbldes.getFont();
        lbldes.setFont(new Font("Arial",Font.BOLD,14));
        lbldes.setBounds(200, 80, 350, 25); 
        pnlMain.add(lbldes);
        
        //initialization of Button on MainPanel
        JButton bFulltime = new JButton("Fulltime Staff");//fulltime staff button
        bFulltime.setBounds(140, 150, 140, 50);
        bFulltime.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                pnlMain.setVisible(false);
                pnlFullTime.setVisible(true);
            }
        });
        pnlMain.add(bFulltime);
    
        JButton bPartime = new JButton("Parttime Staff");//Parttime staff Button
        bPartime.setBounds(355, 150, 140, 50);
        bPartime.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                   pnlMain.setVisible(false);
                   pnlPartTime.setVisible(true);
            }
        });
        pnlMain.add(bPartime);
        
       
        pnlMain.setVisible(true);
        //adding main panel in frame
        f.add(pnlMain);
        
    }
    
    public void initPanelFullTime(){
        //initialization of full time staff panel
        pnlFullTime = new JPanel();
        pnlFullTime.setBounds(0, 0, 650, 500);
        pnlFullTime.setLayout(null);
        
        //initialization of Jlabels
        JLabel lblDes = new JLabel("Full Time Staff");
        JLabel lblVacNo = new JLabel("Vacancy Number:");
        JLabel lblDesig = new JLabel("Designation:");
        JLabel lblJobTyp = new JLabel("Job Type:");
        JLabel lblSalary = new JLabel("Salary:");
        JLabel lblWorkHr = new JLabel("Working Hour:");
        JLabel lblStaff = new JLabel("Staff Name:");
        JLabel lblQuali = new JLabel("Qualification:");
        JLabel lblJoinDate = new JLabel("Date of Joined:");
        JLabel lblAppoint = new JLabel("Appointed By:");
        JLabel lblDay = new JLabel("Day - Month - Year");
        
        //increasing size of JLabel lblDes
        Font fnt = lblDes.getFont();
        lblDes.setFont(new Font("Arial",Font.BOLD,16));
        
        //setting bounds for JLabels
        lblDes.setBounds(270, 10, 150, 30);//(x-axis, y-axis, length, breadth)
        lblVacNo.setBounds(30, 40, 120, 30);
        lblDesig.setBounds(30, 80, 100, 30);
        lblJobTyp.setBounds(30, 120, 100, 30);
        lblSalary.setBounds(350, 40, 120, 30);
        lblWorkHr.setBounds(350, 80, 100, 30);
        lblStaff.setBounds(30, 180, 100, 30);
        lblQuali.setBounds(30, 220, 100, 30);
        lblJoinDate.setBounds(350, 180, 100, 30);
        lblAppoint.setBounds(30, 260, 100, 30);
        lblDay.setBounds(445, 205, 120, 25);
        
        //adding JLabels in Fulltime staff panel
        pnlFullTime.add(lblDes);
        pnlFullTime.add(lblVacNo);
        pnlFullTime.add(lblDesig);
        pnlFullTime.add(lblJobTyp);
        pnlFullTime.add(lblSalary);
        pnlFullTime.add(lblWorkHr);
        pnlFullTime.add(lblStaff);
        pnlFullTime.add(lblQuali);
        pnlFullTime.add(lblJoinDate);
        pnlFullTime.add(lblAppoint);
        pnlFullTime.add(lblDay);
        
        //initialization of JTextField
        tVacNo = new JTextField();
        tDesig = new JTextField();
        tJobType = new JTextField();
        tSalary = new JTextField();
        tWorkHr = new JTextField();
        tStaff = new JTextField();
        tDate = new JTextField();
        tQuali = new JTextField();
        tAppoint = new JTextField();
        
        //setting Bounds of JTextFields
        tVacNo.setBounds(140, 43, 160, 25);//(x-axis, y-axis, length, breadth)
        tDesig.setBounds(140, 83, 160, 25);
        tJobType.setBounds(140, 123, 160, 25);
        tSalary.setBounds(440, 43, 160, 25);
        tWorkHr.setBounds(440, 83, 160, 25);
        tStaff.setBounds(140, 183, 160, 25);
        tDate.setBounds(440, 183, 160, 25);
        tQuali.setBounds(140, 223, 160, 25);
        tAppoint.setBounds(140, 263, 160, 25);
        
        //adding JTextFields on FullTime staff panel
        pnlFullTime.add(tVacNo);
        pnlFullTime.add(tDesig);
        pnlFullTime.add(tJobType);
        pnlFullTime.add(tSalary);
        pnlFullTime.add(tWorkHr);
        pnlFullTime.add(tStaff);
        pnlFullTime.add(tDate);
        pnlFullTime.add(tQuali);
        pnlFullTime.add(tAppoint);
        
        //initialization of JButton in Panel of Full Time StaffHire
        fbtnAdd = new JButton("Add Vacancy");//Add Vacancy button
        fbtnAdd.setBounds(400, 120, 130, 30);//(x-axis, y-axis, length, breadth)
        fbtnAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                addFullTimeStaff();
            }
        });
        pnlFullTime.add(fbtnAdd);
        
        fbtnAppoint = new JButton("Appoint"); //Appoint button
        fbtnAppoint.setBounds(400, 253, 130, 30);
        fbtnAppoint.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                appointFullTimeStaff();
            }
        });
        pnlFullTime.add(fbtnAppoint);
        
        fbtnDisplay = new JButton("Display"); //Display button
        fbtnDisplay.setBounds(100, 320, 130, 30);
        fbtnDisplay.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                fullTimeDisplay();
            }
        });
        pnlFullTime.add(fbtnDisplay);
        
        fbtnClear = new JButton("Clear"); //Clear button
        fbtnClear.setBounds(400, 320, 130, 30);
        fbtnClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                fullTimeClear();
            }
        });
        pnlFullTime.add(fbtnClear);
        
        fbtnBack = new JButton("Home"); //Home button
        fbtnBack.setBounds(30, 380, 100, 25);
        fbtnBack.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                pnlMain.setVisible(true);
                pnlFullTime.setVisible(false);
            }
        });
        pnlFullTime.add(fbtnBack);
        
        fbtnPartTime = new JButton("Part Time"); //Part Time button
        fbtnPartTime.setBounds(490, 380, 100, 25);
        fbtnPartTime.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                pnlFullTime.setVisible(false);
                pnlPartTime.setVisible(true);
            }
        });
        pnlFullTime.add(fbtnPartTime);
        
        pnlFullTime.setVisible(false);
        //adding full time staff panel in frame
        f.add(pnlFullTime);
        
    }
    
    public void addFullTimeStaff(){
        //initialization of variables
        String fVacNo = tVacNo.getText();
        String fDesig = tDesig.getText();
        String fJobType = tJobType.getText();
        String fSalary = tSalary.getText();
        String fWorkHr = tWorkHr.getText();
        int vacancyNo, salary, workingHr;
        
        if (fVacNo.trim().equals("") || fDesig.trim().equals("") || fJobType.trim().equals("") || fSalary.trim().equals("") || fWorkHr.trim().equals("")){
            JOptionPane.showMessageDialog(f, "Please, fill all the information given in the fileds.", "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                //converting String values to int
                vacancyNo = Integer.parseInt(fVacNo);
                salary = Integer.parseInt(fSalary);
                workingHr = Integer.parseInt(fWorkHr);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(f, "Please, enter the number in appropriate field.", "Error!!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //iterating ArrayList by traversing list through for-each loop  
            for(StaffHire sH : staffList){
                if(sH instanceof FullTimeStaffHire){
                    FullTimeStaffHire fT = (FullTimeStaffHire) sH;
                    if(fT.getVacancyNumber() == vacancyNo){
                        JOptionPane.showMessageDialog(f, "Vacancy Number is already added!", "Error!!", JOptionPane.ERROR_MESSAGE);
                        return;    
                    }
                }
            }
            FullTimeStaffHire fullTimeList = new FullTimeStaffHire(vacancyNo, fDesig, fJobType, salary, workingHr);//Constructor of FullTimeStaffHire class
            //Adding user's input value in ArrayList
            staffList.add(fullTimeList);
            JOptionPane.showMessageDialog(f, "Full Time staff is added Successfully.", "Successful", JOptionPane.INFORMATION_MESSAGE);     
        }
    }
    
    public void appointFullTimeStaff(){
        //initialization of variables
        String fVacNo = tVacNo.getText();
        String fStaffName = tStaff.getText();
        String fJoinDate = tDate.getText();
        String fQualification = tQuali.getText();
        String fAppoint = tAppoint.getText();
        int vacancyNo;
        
        if (fVacNo.trim().equals("") || fStaffName.trim().equals("")|| fQualification.trim().equals("") || fJoinDate.trim().equals("")|| fAppoint.trim().equals("")){
            JOptionPane.showMessageDialog(f, "Please, fill all the information given in the field.", "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                //converting String values to int
                vacancyNo = Integer.parseInt(fVacNo);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(f,"Please, enter the number in appropriate field.","Error!!",JOptionPane.ERROR_MESSAGE);
                return;
            }
            boolean join = false;
            for( int i = 0; i < staffList.size(); ++i){
                StaffHire sH = staffList.get(i);
                if(sH instanceof FullTimeStaffHire){
                    FullTimeStaffHire fT = (FullTimeStaffHire) sH;
                    if(fT.getVacancyNumber() == vacancyNo){
                        join = true;
                        if(fT.getJoined() == true){
                            JOptionPane.showMessageDialog(f, "The staff is already appointed!", "Error!!", JOptionPane.ERROR_MESSAGE);
                            return;
                        } 
                        else{
                            fT.fullTimeStaffHire(fStaffName, fJoinDate, fQualification, fAppoint);//method of FullTimeStaffHIre class
                            JOptionPane.showMessageDialog(f, "The staff appointed successfully.", "Successful", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                    }
                }
            }
            if(join == false){
                JOptionPane.showMessageDialog(f,"The vacancy is not added. Please, add the vacancy first.", "Error!!", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }
    
    public void fullTimeDisplay(){
        boolean join = false;
        //iterating ArrayList
        for(StaffHire sH: staffList){
            if(sH instanceof FullTimeStaffHire){
                FullTimeStaffHire fT = (FullTimeStaffHire) sH;
                join = true;
                fT.printDetails();//dipslay method of FullTimeStaffHire class
            }
        }  
        if(join == false){
            JOptionPane.showMessageDialog(f,"Vacancy is not added yet!","Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void fullTimeClear(){
        int x = JOptionPane.showConfirmDialog(f, "Do you want to clear the informations of Full Time Staff?", "Info", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(f, "Cleared", "Info", JOptionPane.INFORMATION_MESSAGE);
            //Setting all the text fields as an empty
            tVacNo.setText("");
            tDesig.setText("");
            tJobType.setText("");
            tSalary.setText("");
            tWorkHr.setText("");
            tStaff.setText("");
            tQuali.setText("");
            tAppoint.setText("");
            tDate.setText("");   
        }
    }
    
    public void initPanelPartTime(){
        //Initialization of part time staff panel
        pnlPartTime = new JPanel();//initialization of part time staff panel object
        pnlPartTime.setBounds(0, 0, 650, 530);//(x-axis, y-axis, length, breadth)
        pnlPartTime.setLayout(null);
        
        //Initialization of JLabels
        JLabel lblDes = new JLabel("Part Time Staff");
        JLabel lblVacNo = new JLabel("Vacancy Number:");
        JLabel lblDesig = new JLabel("Designation:");
        JLabel lblJobTyp = new JLabel("Job Type:");
        JLabel lblWorkSh = new JLabel("Working Shifts:");
        JLabel lblWperHr = new JLabel("Wages per Hour:");
        JLabel lblWorkHr = new JLabel("Working Hour:");
        JLabel lblStaff = new JLabel("Staff Name:");
        JLabel lblQuali = new JLabel("Qualification:");
        JLabel lblJoinDate = new JLabel("Date of Joined:");
        JLabel lblAppoint = new JLabel("Appointed By:");
        JLabel lblDay = new JLabel("Day - Month - Year");
        
        //changing the size and font of JLabel lblDes
        Font fnt = lblDes.getFont();
        lblDes.setFont(new Font("Arial",Font.BOLD,16));
        
        //setting bounds of JLabels
        lblDes.setBounds(270, 10, 150, 30);//(x-axis, y-axis, length, breadth)
        lblVacNo.setBounds(30, 40, 120, 30);
        lblDesig.setBounds(30, 80, 100, 30);
        lblJobTyp.setBounds(30, 120, 100, 30);
        lblWorkSh.setBounds(30, 160, 100, 30);
        lblWperHr.setBounds(344, 40, 120, 30);
        lblWorkHr.setBounds(348, 80, 100, 30);
        lblStaff.setBounds(30, 220, 100, 30);
        lblQuali.setBounds(30, 260, 100, 30);
        lblJoinDate.setBounds(350, 220, 100, 30);
        lblAppoint.setBounds(30, 300, 100, 30);
        lblDay.setBounds(445, 245, 120, 25);
        
        //Adding JLabels to part time staff panel
        pnlPartTime.add(lblDes);
        pnlPartTime.add(lblVacNo);
        pnlPartTime.add(lblDesig);
        pnlPartTime.add(lblJobTyp);
        pnlPartTime.add(lblWperHr);
        pnlPartTime.add(lblWorkHr);
        pnlPartTime.add(lblStaff);
        pnlPartTime.add(lblQuali);
        pnlPartTime.add(lblJoinDate);
        pnlPartTime.add(lblAppoint);
        pnlPartTime.add(lblDay);
        pnlPartTime.add(lblWorkSh);
        
        //Initialization of JTextField
        tpVacNo = new JTextField();
        tpDesig = new JTextField();
        tpJobType = new JTextField();
        tpWorkShift = new JTextField();
        tpWperHr = new JTextField();
        tpWorkHr = new JTextField();
        tpStaff = new JTextField();
        tpDate = new JTextField();
        tpQuali = new JTextField();
        tpAppoint = new JTextField();
        
        //Setting bounds of JTextField
        tpVacNo.setBounds(140, 43, 160, 25);//(x-axis, y-axis, length, breadth)
        tpDesig.setBounds(140, 83, 160, 25);
        tpJobType.setBounds(140, 123, 160, 25);
        tpWorkShift.setBounds(140, 163, 160, 25);
        tpWperHr.setBounds(440, 43, 160, 25);
        tpWorkHr.setBounds(440, 83, 160, 25);
        tpStaff.setBounds(140, 223, 160, 25);
        tpDate.setBounds(440, 223, 160, 25);
        tpQuali.setBounds(140, 263, 160, 25);
        tpAppoint.setBounds(140, 303, 160, 25);
        
        //Adding JTextField to part time staff panel
        pnlPartTime.add(tpVacNo);
        pnlPartTime.add(tpDesig);
        pnlPartTime.add(tpJobType);
        pnlPartTime.add(tpWorkShift);
        pnlPartTime.add(tpWperHr);
        pnlPartTime.add(tpWorkHr);
        pnlPartTime.add(tpStaff);
        pnlPartTime.add(tpDate);
        pnlPartTime.add(tpQuali);
        pnlPartTime.add(tpAppoint);
        
        //initialization of JButton in panel of PartTime Staff
        //Add Vacancy Button
        pbtnAdd = new JButton("Add Vacancy");
        pbtnAdd.setBounds(400, 120, 130, 30);
        pbtnAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                addPartTimeStaff();
            }
        });
        pnlPartTime.add(pbtnAdd);
        
        //Appoint Button
        pbtnAppoint = new JButton("Appoint");
        pbtnAppoint.setBounds(400, 293, 130, 30);
        pbtnAppoint.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                appointPartTimeStaff();
            }
        });
        pnlPartTime.add(pbtnAppoint);
        
        //Display Button
        pbtnDisplay = new JButton("Display");
        pbtnDisplay.setBounds(100, 340, 130, 30);
        pbtnDisplay.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                partTimeDisplay();
            }
        });
        pnlPartTime.add(pbtnDisplay);
        
        //Terminated Buttonl
        pbtnTerminate = new JButton("Terminate");
        pbtnTerminate.setBounds(400, 170, 130, 30);
        pbtnTerminate.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                terminatePartTimeStaff();
            }
        });
        pnlPartTime.add(pbtnTerminate);
        
        //Clear Button
        pbtnClear = new JButton("Clear");
        pbtnClear.setBounds(400, 340, 130, 30);
        pbtnClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                partTimeClear();
            }
        });
        pnlPartTime.add(pbtnClear);
        
        //Home Button
        pbtnBack = new JButton("Home");
        pbtnBack.setBounds(30, 380, 100, 25);
        pbtnBack.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                pnlMain.setVisible(true);
                pnlPartTime.setVisible(false);
            }
        });
        pnlPartTime.add(pbtnBack);
        
        //Full Time Button
        pbtnFullTime = new JButton("Full Time");
        pbtnFullTime.setBounds(490, 380, 100,25);
        pbtnFullTime.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                pnlFullTime.setVisible(true);
                pnlPartTime.setVisible(false);
            }
        });
        pnlPartTime.add(pbtnFullTime);
        
        pnlPartTime.setVisible(false);
        //Adding part time staff panel to Jframe
        f.add(pnlPartTime);
    }
    
    public void addPartTimeStaff(){
        //initialization of variables
        String pVacNo = tpVacNo.getText();
        String pDesig = tpDesig.getText();
        String pJobType = tpJobType.getText();
        String pWorkHr = tpWorkHr.getText();
        String pWages = tpWperHr.getText();
        String pWorkShift = tpWorkShift.getText();
        int vacancyNo, workingHr, wagesHr;
        
        if (pVacNo.trim().equals("") || pDesig.trim().equals("") || pJobType.trim().equals("") || pWorkShift.trim().equals("") || pWages.trim().equals("") || pWorkHr.trim().equals("")){
            JOptionPane.showMessageDialog(f, "please, fill all the information given in the fileds.", "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                //converting String values to int
                vacancyNo = Integer.parseInt(pVacNo);
                workingHr = Integer.parseInt(pWorkHr);
                wagesHr = Integer.parseInt(pWages);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(f, "Please, enter the number in appopriate field.", "Error!!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //Iterating ArrayList by traversing list through for-each loop
            for(StaffHire sH : staffList){
                if(sH instanceof PartTimeStaffHire){
                    PartTimeStaffHire pT = (PartTimeStaffHire) sH;
                    if(pT.getVacancyNumber() == vacancyNo){
                        JOptionPane.showMessageDialog(f, "Vacancy Number already added!", "Error!!", JOptionPane.ERROR_MESSAGE);
                        return;    
                    }
                }
            }
            PartTimeStaffHire partTimeList = new PartTimeStaffHire(vacancyNo, pDesig, pJobType, wagesHr, workingHr, pWorkShift);//Constructor of PartTimeStaffHire class
            //Adding user's input in ArrayList
            staffList.add(partTimeList);
            JOptionPane.showMessageDialog(f, "Part Time staff is added successfully.", "Successful", JOptionPane.INFORMATION_MESSAGE);     
        }
        
    }
    
    public void appointPartTimeStaff(){
        //initialization of variables
        String pVacNo = tpVacNo.getText();
        String pStaff = tpStaff.getText();
        String pDate = tpDate.getText();
        String pQuali = tpQuali.getText();
        String pAppoint = tpAppoint.getText();
        int vacancyNo;
        
        if (pVacNo.trim().equals("") || pStaff.trim().equals("") || pQuali.trim().equals("") || pAppoint.trim().equals("") || pDate.trim().equals("")){
            JOptionPane.showMessageDialog(f, "Please, fill all the information given in the field.", "Error!!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                //converting String values to int
                vacancyNo = Integer.parseInt(pVacNo);
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(f, "Please, enter the number in appropriate field.", "Error!!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            boolean join = false;
            for( int i = 0; i < staffList.size(); ++i){
                StaffHire sH = staffList.get(i);
                if(sH instanceof PartTimeStaffHire){
                    PartTimeStaffHire pT = (PartTimeStaffHire) sH;
                    if(pT.getVacancyNumber() == vacancyNo){
                        join = true;
                        if(pT.getJoined() == true){
                        JOptionPane.showMessageDialog(f, "The staff is already appointed!", "Error!!", JOptionPane.ERROR_MESSAGE);
                        return;
                        } 
                        else{
                        pT.partTimeStaffHire(pStaff, pDate, pQuali, pAppoint);//method of partTimeStaffHire class
                        JOptionPane.showMessageDialog(f, "The staff appointed successfully.", "Successful", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        }
                    }
                }
            }
            if(join == false){
                JOptionPane.showMessageDialog(f,"The vacancy is not added. Please, add the vacancy first", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void terminatePartTimeStaff(){
        //Initialization of variables
        String pVacNo = JOptionPane.showInputDialog(f,"Enter vacancy number.", "Terminate", JOptionPane.QUESTION_MESSAGE);
        int vacancyNo;
        
        try{
            if ( pVacNo.trim().equals("")){
                JOptionPane.showMessageDialog(f, "Please, fill the vacancy numer.", "Error!!", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        catch(NullPointerException npe){
            return;
        }
        
       
        try{
            //Converting string value to int
            vacancyNo = Integer.parseInt(pVacNo);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(f,"Please, enter the appropriate number.", "Error!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean join = false;
        for (StaffHire sH: staffList){
            if(sH instanceof PartTimeStaffHire){
                PartTimeStaffHire pT = (PartTimeStaffHire) sH;
                if(pT.getVacancyNumber()==vacancyNo){
                    join = true;
                    pT.terminatedTheStaff(); //Terminating method of Part time staff hire
                    //Removing terminated staff details form ArrayList.
                    staffList.remove(pT);
                    JOptionPane.showMessageDialog(f,"Staff terminated successfully.", "Successful",JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
        }
        if(join == false){
            JOptionPane.showMessageDialog(f,"Vacancy Number is not found!", "Error!!",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void partTimeDisplay(){
        boolean joined = false;
        //Iterating ArrayList
        for(StaffHire sH: staffList){
            if(sH instanceof PartTimeStaffHire){
                PartTimeStaffHire pT = (PartTimeStaffHire) sH;
                joined = true;
                pT.printDetails();//Display method of PartTimeStaffHire class
            }
        }
        if(joined == false){
            JOptionPane.showMessageDialog(f, "Vacancy is no added yet!","Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void partTimeClear(){
        int x = JOptionPane.showConfirmDialog(f, "Do you want to clear the informations of Part Time Staff?", "Info", JOptionPane.YES_NO_OPTION);
        if (x == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(f, "Cleared", "Info", JOptionPane.INFORMATION_MESSAGE);
            //Setting all the text fields as an empty.
            tpVacNo.setText("");
            tpDesig.setText("");
            tpJobType.setText("");
            tpWorkShift.setText("");
            tpWperHr.setText("");
            tpWorkHr.setText("");
            tpStaff.setText("");
            tpQuali.setText("");
            tpAppoint.setText("");
            tpDate.setText("");
        }   
    }
    
    //main method of INGNepal class
    public static void main(String[] args){
        //Creating object of constructor INGNepal and making visible.
        new INGNepal().f.setVisible(true);
    }
}