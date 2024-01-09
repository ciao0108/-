package StarWar_1110410056;


		// TODO 自動產生的方法 Stub
		class AirCraft {
		    private String model;
		    private int year;

		    public AirCraft(String model, int year) {
		        this.model = model;
		        this.year = year;
		    }

		    public String getModel() {
		        return model;
		    }

		    public void setModel(String model) {
		        this.model = model;
		    }

		    public int getYear() {
		        return year;
		    }

		    public void setYear(int year) {
		        this.year = year;
		    }

		    @Override
		    public String toString() {
		        return "Model: " + model + ", Year: " + year;
		    }
		}

		// XWing 子類別
		class XWing extends AirCraft {
		    private String alliance;

		    public XWing(String model, int year, String alliance) {
		        super(model, year);
		        this.alliance = alliance;
		    }

		    public String getAlliance() {
		        return alliance;
		    }

		    public void setAlliance(String alliance) {
		        this.alliance = alliance;
		    }

		    @Override
		    public String toString() {
		        return "X-Wing - " + super.toString() + ", Alliance: " + alliance;
		    }
		}

		// TieFighter 子類別
		class TieFighter extends AirCraft {
		    private String empire;

		    public TieFighter(String model, int year, String empire) {
		        super(model, year);
		        this.empire = empire;
		    }

		    public String getEmpire() {
		        return empire;
		    }

		    public void setEmpire(String empire) {
		        this.empire = empire;
		    }

		    @Override
		    public String toString() {
		        return "Tie Fighter - " + super.toString() + ", Empire: " + empire;
		    }
		}

		// 主類別
		public class Main {
		    public static void main(String[] args) {
		        // 建立 Tie Fighter 和 X-Wing 物件
		        TieFighter tie01 = new TieFighter("Tie Fighter", 2023, "Galactic Empire");
		        XWing xwing01 = new XWing("X-Wing", 2022, "Rebel Alliance");

		        // 印出物件資訊
		        System.out.println("Tie Fighter Info:");
		        System.out.println(tie01.toString());

		        System.out.println("\nX-Wing Info:");
		        System.out.println(xwing01.toString());
		    }
		
	}

