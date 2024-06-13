CREATE DATABASE telephoneDB;
USE telephoneDB;
CREATE TABLE telephone (
    id INT AUTO_INCREMENT PRIMARY KEY,
    marque VARCHAR(50),
    modele VARCHAR(50),
    prix DECIMAL(10, 2),
    description TEXT,
    url_image VARCHAR(255)
);
INSERT INTO telephone (marque, modele, prix, description, url_image) VALUES
('Apple', 'iPhone 13', 799.99, 'Le dernier modèle de l’iPhone avec A15 Bionic.', 'https://static.techspot.com/images/products/2021/smartphones/org/2021-09-21-product-9.jpg'),
('Samsung', 'Galaxy S21', 699.99, 'Smartphone avec écran AMOLED et processeur Exynos.', 'https://http2.mlstatic.com/D_NQ_NP_740772-MLA44850456503_022021-F.jpg'),
('Google', 'Pixel 6', 599.99, 'Smartphone avec Google Tensor et Android 12.', 'https://example.com/pixel6.jpg'),
('OnePlus', '9 Pro', 729.99, 'Smartphone avec écran 120Hz et Snapdragon 888.', 'https://example.com/oneplus9pro.jpg'),
('Xiaomi', 'Mi 11', 649.99, 'Smartphone avec caméra 108 MP et Snapdragon 888.', 'https://example.com/mi11.jpg'),
('Huawei', 'P50 Pro', 749.99, 'Smartphone avec caméra Leica et écran OLED.', 'https://example.com/p50pro.jpg'),
('Sony', 'Xperia 1 III', 799.99, 'Smartphone avec écran 4K et triple caméra.', 'https://example.com/xperia1iii.jpg'),
('Oppo', 'Find X3 Pro', 799.99, 'Smartphone avec écran AMOLED et Snapdragon 888.', 'https://example.com/findx3pro.jpg'),
('Vivo', 'X60 Pro', 649.99, 'Smartphone avec caméra Zeiss et Snapdragon 870.', 'https://example.com/x60pro.jpg'),
('Nokia', '8.3 5G', 599.99, 'Smartphone avec écran PureDisplay et 5G.', 'https://example.com/nokia83.jpg');
