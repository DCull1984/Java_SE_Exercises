package com.SpringGarage.Cull_David.GarageModel;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "TestVehicle")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"creationDate", "lastModified"}, allowGetters = true)
public class GarageDataModel implements Serializable
{
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotBlank
		private String type;
		
		@NotBlank
		private String make;
		
		@NotBlank
		private String model;
		
		@NotBlank
		private String colour;
		
		private Integer engineCapacity;
		
		@Column(nullable = false, updatable = false)
		@Temporal(TemporalType.TIMESTAMP)
		@CreatedDate
		private Date creationDate;
		
		@Column(nullable = false)
		@Temporal(TemporalType.TIMESTAMP)
		@LastModifiedDate
		private Date lastModified;
		
		
		public GarageDataModel()
		{
			
		}
		
		public GarageDataModel(String pType, String pMake, String pModel, 
				String pColour, Integer pEngineCapacity)
		{
			this.type = pType;
			this.make = pMake;
			this.model = pModel;
			this.colour = pColour;
			this.engineCapacity = pEngineCapacity;			
		}
		
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getMake() {
			return make;
		}

		public void setMake(String pMake) {
			this.make = pMake;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String pModel) {
			this.model = pModel;
		}

		public String getColour() {
			return colour;
		}

		public void setColour(String colour) {
			this.colour = colour;
		}

		public Integer getEngineCapacity() {
			return engineCapacity;
		}

		public void setEngineCapacity(Integer pEngineCapacity) {
			this.engineCapacity = pEngineCapacity;
		}

		public Date getCreationDate() {
			return creationDate;
		}

		public void setCreationDate(Date creationDate) {
			this.creationDate = creationDate;
		}

		public Date getLastModified() {
			return lastModified;
		}

		public void setLastModified(Date lastModified) {
			this.lastModified = lastModified;
		}
		
		
		
}

