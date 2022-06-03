package Com.cg.demo.oop;

public class BasicPhone2 {
	// DRY - 


			void call() {
				System.out.println("Calling...");
			}

			void sms() {
				System.out.println("Sending SMS...");
			}
		}

		class SmartPhone extends BasicPhone {

			void calling() {
				System.out.println("Smart calling...");
			}
			void music() {
				System.out.println("Playing music...");
			}

			void camera() {
				System.out.println("Clicking pics...");

			}

		}
}
