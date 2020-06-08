package cts.exam.s1.pattern2;

public class Booking {
	private String hotelNmae;

	private Boolean breakfast;
	private Boolean seaView;
	private int noPers;
	private String bedType;

	public Booking(Builder booking) {
		super();
		this.hotelNmae = booking.hotelNmae;
		this.breakfast = booking.breakfast;
		this.seaView = booking.seaView;
		this.noPers = booking.noPers;
		this.bedType = booking.bedType;
	}
	
	

	@Override
	public String toString() {
		return "Booking [hotelNmae=" + hotelNmae + ", breakfast=" + breakfast + ", seaView=" + seaView + ", noPers="
				+ noPers + ", bedType=" + bedType + "]";
	}



	public static class Builder {
		private String hotelNmae;

		private Boolean breakfast;
		private Boolean seaView;
		private int noPers;
		private String bedType;

		public Builder(String hotelNmae) {
			super();
			this.hotelNmae = hotelNmae;
		}

		public Builder setBreakfast(Boolean breakfast) {
			this.breakfast = breakfast;
			return this;
		}

		public Builder setSeaView(Boolean seaView) {
			this.seaView = seaView;
			return this;
		}

		public Builder setNoPers(int noPers) {
			this.noPers = noPers;
			return this;
		}

		public Builder setBedType(String bedType) {
			this.bedType = bedType;
			return this;
		}

		public Booking build() {
			return new Booking(this);
		}

	}
}
