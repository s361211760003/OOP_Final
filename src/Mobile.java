public class Mobile {
        //attributes
        private int ID;
        private String Brand ;
        private String Color;

        public Mobile(int ID, String Brand, String Color) {
            this.ID = ID;
            this.Brand = Brand;
            this.Color = Color;

        }
        //getter and setter
        public void setBrand(String brand) {
            Brand = brand;
        }

        public void setColor(String color) {
            Color = color;
        }

        //toString
         @Override
            public String toString() {
            return "Mobile{" +
                    "ID=" + ID +
                    ", Brand='" + Brand + '\'' +
                    ", Color='" + Color + '\'' +
                    '}';
         }

          public int getID() {
                return ID;
            }

            public void setID(int ID) {
                this.ID = ID;
            }
          }

