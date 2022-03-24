package AlphaAlley;

public class Television {
        private String productName;
        private int volume;
        private boolean isOn;
        private int channel;

        public Television(String productName, int volume, boolean isOn, int channel){
            this.productName = productName;
            this.volume = volume;
            this.isOn = isOn;
            this.channel = channel;
        }

        public boolean getIsOn() {
            return isOn;
        }

        public void setIsOn(boolean isOn) {
            this.isOn = isOn;
        }


        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductName() {
            return productName;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }

        public int getVolume() {
            return volume;
        }

        public void setVolumeIncrease() {
            volume = volume + 1;
        }

        public void setVolumeDecrease() {
            volume = volume - 1;
        }

        public int getChannel() {
            return channel;
        }

        public void setChannel(int channel) {
            this.channel = channel;
        }

        public void increaseChannel(int channel) {
        }

        public void setIncreaseChannel() {
            channel = channel + 1;
        }

        public void setDecreaseChannel() {
            channel = channel - 1;
        }
    }

