<?php

// define product class
class Product
{
	//atribut
	private $idProduct;
	private $price;

	//constructor
	public function Product($idProduct = 0, $price = 0)
	{
		$this->idProduct = $idProduct;
		$this->price = $price;
	}

	// getter and setter
	public function setIdProduct($idProduct)
	{
		$this->idProduct = $idProduct;
	}

	public function getIdProduct()
	{
		return $this->idProduct;
	}

	public function setPrice($price)
	{
		$this->price = $price;
	}

	public function getPrice()
	{
		return $this->price;
	}
}