import java.awt.Font;
import java.io.*;
import java.util.*;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.axis.CategoryAxis;


public class DataTest extends ApplicationFrame{
	public static String line;
	public static String Date;
	public static String Open;
	public static String High;
	public static String Low;
	public static String Close;
	public static String Volume;
	public static String Adj;
	public static int counter;
	 public DataTest(String title) throws IOException
	    {
	        super(title);
	        this.setContentPane(createPanel()); //构造函数中自动创建Java的panel面板
	    }
	    
	    public static CategoryDataset createDataset() throws IOException //创建柱状图数据集
	    {
	        
	    	DefaultCategoryDataset dataset=new DefaultCategoryDataset();
	    	BufferedReader br = new BufferedReader(
	    			   new InputStreamReader(
	    			    new FileInputStream("Sample data.xlsx")
	    			   )
	    			);


	    			while ( (line = br.readLine()) != null ) {
	    			   //System.out.println(line); 
	    			    String[] info = line.split(",");
	    			  
	    			   Date = info[0].trim();
	    			   Open= info[1].trim();
	    			   High= info[2].trim();
	    			   Low= info[3].trim();
	    			   Close= info[4].trim();
	    			   Volume= info[5].trim();
	    			   Adj= info[6].trim();
	    			   counter++;
	    			 
	    			 // dataset.setValue(3,"a",Date);
	    			  //dataset.setValue(Float.parseFloat(High.trim()),"a",Date);
	    			 
	    			}
	    	
//	        dataset.setValue(20,"b","market");
//	        dataset.setValue(40,"c","developer");
//	        dataset.setValue(15,"d","other");
	        return dataset;
	    }
	    
	    
	    


	    
	    
	    
		public static JFreeChart createChart(CategoryDataset dataset) //用数据集创建一个图表
	    {
	        JFreeChart chart=ChartFactory.createBarChart("hi", "人员分布", 
	                "人员数量", dataset, PlotOrientation.VERTICAL, true, true, false); //创建一个JFreeChart
	        //chart.setTitle(new TextTitle("chart",new Font("宋体",Font.BOLD+Font.ITALIC,20)));//可以重新设置标题，替换“hi”标题
	        CategoryPlot plot=(CategoryPlot)chart.getPlot();//获得图标中间部分，即plot
	        CategoryAxis categoryAxis=plot.getDomainAxis();//获得横坐标
	        //categoryAxis.setLabelFont(new Font("微软雅黑",Font.BOLD,12));//设置横坐标字体
	        return chart;
	    }
		
		
	    
	    public static JPanel createPanel() throws IOException
	    {
	        JFreeChart chart =createChart(createDataset());
	        return new ChartPanel(chart); //将chart对象放入Panel面板中去，ChartPanel类已继承Jpanel
	    }
	    
	    
	    
	    public static void main(String[] args) throws IOException
	    {
	    	//Read();
	    	DataTest chart=new DataTest("Chart title");
	        chart.pack();//以合适的大小显示
	        chart.setVisible(true);
	        
	    }
	}



