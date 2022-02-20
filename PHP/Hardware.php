<?php

include "Product.php";


class Hardware extends Product
{
	//atribut
	private $model;
	private $brand;

	// constructor
	public function Hardware($model = "", $brand = "")
	{
		$this->model = $model;
		$this->brand = $brand;
	}

	// getter and setter
	public function setModel($model)
	{
		$this->model = $model;
	}

	public function getModel()
	{
		return $this->model;
	}

	public function setBrand($brand)
	{
		$this->brand = $brand;
	}

	public function getBrand()
	{
		return $this->brand;
	}
}