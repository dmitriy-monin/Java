using ClinicService.Models;

namespace ClinicService.Services.Impl
{
    /// <summary>
    /// ДОМАШНЯЯ РАБОТА Добавить имплементацию для текущего репозитория
    /// </summary>
    public class PetRepository : IPetRepository
    {
        public int Create(Pet item)
        {
            SQLiteConnection connection = new SQLiteConnection(connectionString);
            connection.Open();
            SQLiteCommand command = new SQLiteCommand(connection);
            command.CommandText = "INSERT INTO Pet(ClientId, Name, Birthday) VALUES(@ClientId, @Name, @Birthday)";
            command.Parameters.AddWithValue("@ClientId", item.ClientId);
            command.Parameters.AddWithValue("@Name", item.Name);
            command.Parameters.AddWithValue("@Birthday", item.Birthday.Ticks);
            command.Prepare();
            int res = command.ExecuteNonQuery();
            connection.Close();
            return res;
        }

        public int Delete(int id)
        {
            SQLiteConnection connection = new SQLiteConnection(connectionString);
            connection.Open();
            SQLiteCommand command = new SQLiteCommand(connection);
            command.CommandText = "DELETE FROM Pet WHERE PetnId = @PetId";
            command.Parameters.AddWithValue("@PetId", id);
            command.Prepare();
            int res = command.ExecuteNonQuery();
            connection.Close();
            return res;
        }

        public IList<Pet> GetAll()
        {
            List<Pet> list = new List<Pet>();
            SQLiteConnection connection = new SQLiteConnection(connectionString);
            connection.Open();
            SQLiteCommand command = new SQLiteCommand(connection);
            command.CommandText = "SELECT * FROM Pet";
            SQLiteDataReader reader = command.ExecuteReader();

            while (reader.Read())
            {
                Pet pet = new Pet();
                pet.PetId = reader.GetInt32(0);
                pet.ClientId = reader.GetInt32(1);
                pet.Name = reader.GetString(2);
                pet.Birthday = reader.GetInt64(3),
                
                list.Add(pet);
            }

            connection.Close();
            return list;
        }

        public Pet GetById(int id)
        {
            SQLiteConnection connection = new SQLiteConnection(connectionString);
            connection.Open();
            SQLiteCommand command = new SQLiteCommand(connection);
            command.CommandText = "SELECT * FROM Pet WHERE PetId=@PetId";
            command.Parameters.AddWithValue("@PetId", id);
            command.Prepare();
            SQLiteDataReader reader = command.ExecuteReader();

            if (reader.Read())
            {
                Pet pet = new Pet();
                pet.PetId = reader.GetInt32(0);
                pet.ClientId = reader.GetInt32(1);
                pet.Name = reader.GetString(2);
                pet.Birthday = reader.GetInt64(3),

                connection.Close();
                return pet;
            }
            else
            {
                connection.Close();
                return null;
            }

            public int Update(Pet item)
            {
                SQLiteConnection connection = new SQLiteConnection(connectionString);
                connection.Open();
                SQLiteCommand command = new SQLiteCommand(connection);
                command.CommandText = "UPDATE Pet SET ClientId = @ClientId, Name = @Name, Birthday = @Birthday WHERE PetId = @PetId";
                command.Parameters.AddWithValue("@ClientId", item.ClientId);
                command.Parameters.AddWithValue("@Name", item.Name);
                command.Parameters.AddWithValue("@Birthday", item.Birthday.Ticks);
                command.Prepare();
                int res = command.ExecuteNonQuery();
                connection.Close();
                return res;

            }
        }
    }
