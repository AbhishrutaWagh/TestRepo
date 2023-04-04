package Autosuggestion.DefaultRelatedSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlyAllVisibleLinktextInFlipcartWebpage_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhilasha Anil Wagh\\eclipse-workspace\\Qspider_Automation\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
List<WebElement> elements = driver.findElements(By.tagName("a"));
	    
        for(WebElement ele:elements)
        {
                     String visibleLink = ele.getText();
                     if(!visibleLink.isEmpty())
                     {
                    	 System.out.println(visibleLink);
                     }
        }
}

}
// o/p=Explore Plus
//		 Login
//		 Become a Seller
//		 Top Offers
//		 Grocery
//		 Mobiles
//		 Fashion
//		 Electronics
//		 Home
//		 Appliances
//		 Travel
//		 Beauty, Toys & More
//		 2-Wheelers
//		 VIEW ALL
//		 Printers
//		 From ₹3999
//		 HP
//		 Top Mirrorless Cameras
//		 Shop Now!
//		 Canon, Sony, Fujifilm...
//		 Best of Hair Dryers
//		 From ₹399
//		 Philips, Nova, Havells & more
//		 VIEW ALL
//		 Ab Exerciser
//		 From ₹199
//		 Adrenex, Manogyam & More
//		 Tricycles & Rideons
//		 Up to 70% Off
//		 Figurines, Battle Toys & more
//		 Musical Keyboards
//		 up to 70% off
//		 Beston, Redbox & more
//		 Badminton Racquets
//		 From ₹899
//		 Full Graphite Racquets
//		 VIEW ALL
//		 Flasks
//		 Min. 50% Off
//		 Blankets
//		 Min. 50% Off
//		 Mats
//		 Min. 50% Off
//		 Cookware
//		 Min. 30% Off
//		 Brand Directory
//		 Bounce Infinity E1
//		 iPhone 14 Covers
//		 vivo T1X
//		 OPPO Reno8 5G
//		 OPPO Reno8 Pro 5G
//		 Nothing Phone 1
//		 Sell Old Mobile Phones
//		 ASUS TUF Gaming F15 Core i5 10th Gen
//		 Electronics Store
//		 OPPO A16K
//		 Vivo Y33T
//		 OPPO Reno7 5G
//		 Bathroom Exhaust Fan
//		 Samsung Window AC
//		 OPPO Reno7 Pro 5G
//		 iPhone 13
//		 iPhone 13 Pro
//		 iPhone 13 Pro Max
//		 iPhone 13 Mini
//		 Google Pixel 6a covers
//		 Flipkart Quick
//		 Books
//		 Flipkart Help Centre
//		 Online Boat Store
//		 Covers from Rs 99
//		 Flipkart Track Orders
//		 Flipkart Manage Orders
//		 Flipkart Return Orders
//		 Flipkart Gift Cards Store
//		 Flipkart Axis Bank Credit Card
//		 Flipkart Pay Later
//		 iPhone 12 64GB
//		 iPhone 12 Pro 512GB
//		 iPhone 12 128GB
//		 Vivo Y91i
//		 Vivo Y11
//		 Vivo Y15
//		 Vivo Y50
//		 Vivo Y12
//		 Reno2 F
//		 Oppo A12
//		 Oppo F15
//		 Oppo A31
//		 Samsung A71
//		 Samsung A51
//		 Samsung A31
//		 Realme X2
//		 iPhone 11
//		 iPhone 11 Pro
//		 iPhone 11 Pro Max
//		 Mobile Offers
//		 iphone x
//		 4G Mobile
//		 Nokia Mobile
//		 Samsung Mobile
//		 iphone
//		 Oppo Mobile
//		 Vivo Mobile
//		 GoPro Action Camera
//		 Nikon Camera
//		 Canon Camera
//		 Sony Camera
//		 Canon DSLR
//		 Nikon DSLR
//		 MacBook Pro M2
//		 acer Ryzen 3 Dual Core 3250U - (8 GB/256 GB SSD/Windows 11 Home) Z2-493 Thin and Light Laptop
//		 ASUS Vivobook S14 OLED (2022)
//		 ASUS Zenbook 14 OLED (2022)
//		 Realme Book Prime Core i5 11th Gen
//		 Microsoft Surface Go Pentium 128GB
//		 Branded Laptops
//		 Apple Laptops
//		 Acer Laptops
//		 Lenovo Laptops
//		 Dell Laptops
//		 Asus Laptops
//		 HP Laptops
//		 Gaming Laptops
//		 2 in 1 Laptops
//		 Laptops
//		 Dell latest laptops 2022
//		 HP latest laptops 2022
//		 Infinix INBook X1 Neo Series Celeron Quad Core - (8 GB/256 GB SSD/Windows 11 Home) XL22 Thin and Light Laptop
//		 Microsoft Laptops
//		 12th Gen Intel Core Laptops
//		 Nokia TV
//		 Panasonic TV
//		 Thomson TV
//		 Vu TV
//		 Realme TV
//		 Motorola TV
//		 OnePlus TVs
//		 LG TV
//		 TV
//		 Sony TV
//		 Samsung TV
//		 Android Television
//		 Iffalcon Tv
//		 Mi TV
//		 TV & Appliances End of Season Sale
//		 Television
//		 Washing Machines
//		 Refrigerators
//		 Air Conditioners
//		 Electric Cookers
//		 Electric Jug(Heater) / Travel Kettles
//		 Induction Cooktops
//		 Inverters / stabilizer
//		 Irons / Iron Box
//		 Mixer Grinder Juicer
//		 Wet Grinders
//		 Chimneys
//		 Microwave Ovens
//		 Vacuum Cleaners
//		 Water Purifier
//		 Fan
//		 MarQ Customer Care
//		 Men Shirts
//		 Kurta Pajama
//		 Kurtas
//		 Men T-Shirts
//		 Jeans
//		 Saree
//		 Dresses
//		 Kids Dresses
//		 Designer Salwar Suits
//		 Bra
//		 Designer Kurtis
//		 Track Pant
//		 Men Kurtas
//		 Gym Wear
//		 Party Dresses
//		 Palazzo Suits
//		 Boys Clothing
//		 Gloves
//		 Nighty
//		 Maxi Dresses
//		 Anarkali
//		 Gowns
//		 Culottes
//		 Salwar Suits
//		 Kurtis
//		 Designer Sarees
//		 Leggings
//		 Shorts
//		 Georgette Sarees
//		 Ethnic Wear
//		 Briefs & Trunks
//		 Nike Watches
//		 Ascot Tie
//		 Corset Tops Tunics
//		 Leather PU Skirts
//		 Corset tops camisoles
//		 Women magenta earrings
//		 No collar jackets
//		 Green dress material
//		 Black patiala kurta set
//		 Men camel shoes casual
//		 Black pathani
//		 Wallets sling
//		 Khaki dresses
//		 Kids formal dresses
//		 Mauve shirts
//		 Women henley
//		 Indigo trousers
//		 Leopard dresses
//		 Sleeveless shrugs
//		 Shoes
//		 Adidas Shoes
//		 Reebok Shoes
//		 Nike Shoes
//		 Puma Shoes
//		 Boots
//		 Bata Shoes
//		 Woodland Shoes
//		 Skechers Shoes
//		 Sneakers
//		 Womens Boots
//		 Sports Shoes
//		 Loafers
//		 Sandals
//		 Lotto Sports Shoes
//		 Casual Shoes
//		 Womens Skechers Shoes
//		 Asics Sports Shoes
//		 Formal Shoes
//		 School Shoes
//		 PhonePe Grocery Voucher
//		 Hand Wash
//		 Soap
//		 Cashew Nuts
//		 Sunflower Oil
//		 Eggs
//		 Toilet Cleaner
//		 Harpic Toilet Cleaner
//		 Dettol Soap
//		 Mustard Oil
//		 Biscuits
//		 Cheese
//		 Patanjali Atta
//		 Fortune Oil
//		 Aashirvaad Atta
//		 Tea
//		 Fire-Boltt Ninja Calling Pro Bluetooth Calling Smartwatch 1.69 inch HD Display Smartwatch
//		 Best Gas Geyser
//		 Kitchen Geyser
//		 Nutri Blenders
//		 Portable Air Cooler
//		 Best Air Cooler
//		 Bags
//		 Hitachi Refrigerator 3 Door
//		 Books
//		 Toys
//		 Candles
//		 Helmets
//		 Wall Clocks
//		 Baby Food
//		 Chocolates
//		 Cycles
//		 Calculators
//		 Lipsticks
//		 Mask
//		 Vertiv UPS
//		 Fastrack Watches
//		 Wallets
//		 Earrings
//		 Gold Coins
//		 Realme Pad Mini
//		 Handbags
//		 conekt SW2 Smartwatch
//		 Mivi DuoPods a350
//		 Speaker Cleaner
//		 Furniture
//		 Sofas
//		 Beds
//		 Dining sets
//		 Wardrobes
//		 Mattresses
//		 TV Units
//		 Tables
//		 Chairs
//		 Shelves
//		 Bean Bags
//		 Office Chairs
//		 Computer Table
//		 Office Tables
//		 Red Sofa
//		 Wakefit Beds
//		 White Sofa
//		 Wakefit Mattress
//		 Green Sofa
//		 Black Sofa
//		 Brown Sofa
//		 Whey Protein
//		 Homeopathy
//		 Bounce Infinity
//		 ToysRus
//		 Online Guitar
//		 Books Store
//		 Musical Instrument Store
//		 Energy Drinks
//		 Toys
//		 Milk Drink Mixes
//		 Rakhi
//		 Indian Flag
//		 Protein Supplements
//		 Contact Us
//		 About Us
//		 Careers
//		 Flipkart Stories
//		 Press
//		 Flipkart Wholesale
//		 Corporate Information
//		 Payments
//		 Shipping
//		 Cancellation & Returns
//		 FAQ
//		 Report Infringement
//		 Return Policy
//		 Terms Of Use
//		 Security
//		 Privacy
//		 Sitemap
//		 EPR Compliance
//		 Facebook
//		 Twitter
//		 YouTube
//		 044-45614700
//		 Become a Seller
//		 Advertise
//		 Gift Cards
//		 Help Center

