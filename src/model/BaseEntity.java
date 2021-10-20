package model;

	import java.io.Serializable;

	public interface BaseEntity extends Serializable {
		
		public Long getCodigo();
		
		public void setCodigo(Long codigo);

	}
