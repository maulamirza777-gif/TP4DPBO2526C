Saya Maula Mirza Ananda dengan NIM 2407087 mengerjakan Tugas Praktikum 3 pada Mata Kuliah Desain dan Pemrograman Berorientasi Objek (DPBO)
untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.
<img width="275" height="638" alt="image" src="https://github.com/user-attachments/assets/77acd996-ed38-452a-a5da-72702de27fc1" />

## PENJELASAN KELAS Person:

- Kelas Person diisi oleh atribut privat berupa id(string). name(string), year(int), email(string), category(string)
- Fungsi di kelas Person hanya berupa getter setter

## PENJELASAN KELAS UI:
- Atribut textField2 = digunakan untuk kolom textfield nama
- Atribut textField4 = variable yang digunakan untuk kolom email
- table1 = variable untuk tabel;
- textField5 = variable untuk kolom id
- ADDButton = button add
- EDITButton = button edit variable
- DELETEButton = delete button variable
- comboBox1 = comboBox untuk kolom tahun
- mainPanel = panel utama;
- comboBox2 = comboBox untuk kolom status/category
- personList = list untuk menyimpan Person;
- ADDButton.addActionListener(new ActionListener()) = Fungsi add button di init UI() untuk menambah ke personList dari textfield dan combobox
- EDITButton.addActionListener(new ActionListener()) = Fungsi edit button di init UI() untuk mengedit anggota personList dari textfield dan combobox
- DELETEButton.addActionListener(new ActionListener()) = Fungsi DELETE button di init UI() untuk menghapus anggota dari personList dari textfield ID
- setComboBox() = fungsi untuk meninisialisasi comboBox
- findPersonIndexById(String id) = fungsi untuk mencari specific index di personList
- setTable() = fungsi untuk menginisialisasi tabel
